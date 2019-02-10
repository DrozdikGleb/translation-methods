package ru.drozdov.generator;

import ru.drozdov.generator.tokens.MyToken;
import ru.drozdov.generator.tokens.NotTerminal;
import ru.drozdov.generator.tokens.Production;
import ru.drozdov.generator.tokens.Terminal;

import java.util.*;

public class ParsedGrammar {
    private List<NotTerminal> notTerminals;

    private List<Terminal> terminals;
    private String grammarName;
    private String startNotTerminal;
    private Map<String, Set<String>> firstSets;
    private Map<String, Set<String>> followSets;
    private Map<String, NotTerminal> notTerminalsMap;
    private Map<String, Terminal> terminalsMap;
    private boolean changed;

    public ParsedGrammar(String startNotTerminal, String grammarName, List<NotTerminal> notTerminals, List<Terminal> terminals) {
        this.startNotTerminal = startNotTerminal;
        this.grammarName = grammarName;
        this.notTerminals = notTerminals;
        this.terminals = terminals;
        createMaps(notTerminals, terminals);
        firstSets = new HashMap<>();
        followSets = new HashMap<>();
    }

    private void createMaps(List<NotTerminal> notTerminals, List<Terminal> terminals) {
        notTerminalsMap = new HashMap<>();
        terminalsMap = new HashMap<>();
        for (int i = 0; i < notTerminals.size(); i++) {
            NotTerminal curNotTerminal = notTerminals.get(i);
            notTerminalsMap.put(curNotTerminal.getName(), curNotTerminal);
        }
        for (int i = 0; i < terminals.size(); i++) {
            Terminal curTerminal = terminals.get(i);
            terminalsMap.put(curTerminal.getName(), curTerminal);
        }
    }

    public Map<String, NotTerminal> getNotTerminalsMap() {
        return notTerminalsMap;
    }

    public List<Terminal> getTerminals() {
        return terminals;
    }

    public List<NotTerminal> getNotTerminals() {
        return notTerminals;
    }

    public String getStartNotTerminal() {
        return startNotTerminal;
    }

    public Map<String, Set<String>> getFirstSets() {
        return firstSets;
    }

    public Map<String, Set<String>> getFollowSets() {
        return followSets;
    }

    private void first(Production production, String curNotTerminalName) {
        MyToken prevToken = null;
        for (MyToken curToken : production.getProductionTokens()) {
            if (curToken instanceof Terminal) {
                if (firstSets.get(curNotTerminalName).add(curToken.getName())) {
                    changed = true;
                }
                break;
            } else if (curToken instanceof NotTerminal) {
                String notTerminalName = curToken.getName();
                if (prevToken != null) {
                    if (firstSets.get(prevToken.getName()).contains("EPS")) {
                        if (firstSets.get(curNotTerminalName).addAll(firstSets.get(notTerminalName))) {
                            changed = true;
                        }
                    } else {
                        break;
                    }
                } else {
                    if (firstSets.get(curNotTerminalName).addAll(firstSets.get(notTerminalName))) {
                        changed = true;
                    }
                }
                prevToken = curToken;
            }
        }
    }

    public void constructFIRST() {
        for (NotTerminal notTerminal : notTerminals) {
            firstSets.put(notTerminal.getName(), new HashSet<>());
        }
        changed = true;
        while (changed) {
            changed = false;
            for (NotTerminal notTerminal : notTerminals) {
                String curNotTerminalName = notTerminal.getName();
                for (Production production : notTerminal.getProductions()) {
                    first(production, curNotTerminalName);
                }
            }
        }
        //printMap(firstSets);
    }

    public void constructFOLLOW() {
        for (NotTerminal notTerminal : notTerminals) {
            followSets.put(notTerminal.getName(), new HashSet<>());
        }

        followSets.get(startNotTerminal).add("$");

        boolean changed = true;
        while (changed) {
            changed = false;
            for (NotTerminal notTerminal : notTerminals) {
                String curNotTerminalName = notTerminal.getName();
                for (Production production : notTerminal.getProductions()) {
                    List<MyToken> curTokens = production.getProductionTokens();
                    for (int i = 0; i < curTokens.size() - 1; i++) {
                        MyToken curToken = curTokens.get(i);
                        MyToken nextToken = curTokens.get(i + 1);
                        if (curToken instanceof NotTerminal) {
                            if (nextToken instanceof NotTerminal) {
                                Set<String> firstSet = firstSets.get(nextToken.getName());
                                if (firstSet.contains("EPS")) {
                                    if (followSets.get(curToken.getName()).addAll(followSets.get(curNotTerminalName))) {
                                        changed = true;
                                    }
                                }
                                Set<String> setWithoutEPS = new HashSet<>(firstSet);
                                setWithoutEPS.remove("EPS");
                                if (followSets.get(curToken.getName()).addAll(setWithoutEPS)) {
                                    changed = true;
                                }
                            } else if (nextToken instanceof Terminal) {
                                if (followSets.get(curToken.getName()).add(nextToken.getName())) {
                                    changed = true;
                                }
                            }
                        }
                        if (i == curTokens.size() - 3) {
                            if (nextToken instanceof NotTerminal) {
                                if (followSets.get(nextToken.getName()).addAll(followSets.get(curNotTerminalName))) {
                                    changed = true;
                                }
                            }
                        }
                    }
                }

            }
        }
        //printMap(followSets);
    }

    private void printMap(Map<String, Set<String>> map) {
        for (Map.Entry<String, Set<String>> curEntry : map.entrySet()) {
            String nonTerminal = curEntry.getKey();
            Set<String> firstSet = curEntry.getValue();
            System.out.println(nonTerminal);
            Iterator iterator = firstSet.iterator();
            while (iterator.hasNext()) {
                System.out.print(iterator.next() + " ");
            }
            System.out.println();
            System.out.println();
        }
    }
}
