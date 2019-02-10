#!/bin/bash

path_to_dir = "/Users/glebdrozdov/IdeaProjects/translation-methods/"

java -cp ${path_to_dir}target/classes Main

dot -Tpng ${path_to_dir}src/main/resources/tree.dot > ${path_to_dir}src/main/resources/tree.png