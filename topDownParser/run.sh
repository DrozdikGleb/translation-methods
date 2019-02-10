#!/bin/bash

path_to_dir = "/Users/glebdrozdov/IdeaProjects/translation-methods/topDownParser"

dot -Tpng ${path_to_dir}src/main/resources/$1.dot > ${path_to_dir}src/main/resources/$1.png
