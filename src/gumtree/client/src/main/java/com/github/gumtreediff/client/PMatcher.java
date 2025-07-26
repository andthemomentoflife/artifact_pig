package com.github.gumtreediff.client;

import com.github.gumtreediff.matchers.MappingStore;
import com.github.gumtreediff.matchers.Matchers;
import com.github.gumtreediff.matchers.Matcher;
// import com.github.gumtreediff.actions.EditScript;
// import com.github.gumtreediff.actions.EditScriptGenerator;
// import com.github.gumtreediff.actions.SimplifiedChawatheScriptGenerator;
// import com.github.gumtreediff.matchers.ConfigurationOptions;
import com.github.gumtreediff.matchers.GumtreeProperties;
import com.github.gumtreediff.matchers.Mapping;
import com.github.gumtreediff.tree.Tree;
import com.github.gumtreediff.tree.TreeContext;
import java.io.IOException;

// Class declaration
public class PMatcher{
    public static int[] PMadtcher(String rooto, String rootn, String nodeo, int start1, int end1) throws IOException{
        // int[] result = {};
        Run.initGenerators();

        TreeContext srcCtx = new PythonTreeGenerator().generateFrom().string(rooto);
        TreeContext dstCtx = new PythonTreeGenerator().generateFrom().string(rootn);
        // TreeContext nodeCtx = new PythonTreeGenerator().generateFrom().string(nodeo);
       
        Tree src = srcCtx.getRoot();
        Tree dst = dstCtx.getRoot();
        // Tree node = nodeCtx.getRoot();

        GumtreeProperties Properties = new GumtreeProperties();
        Properties.put(ConfigurationOptions.st_minprio, 1);
        // value:1 => default.jar , value:0 => ours.jar

        Matcher defaultMatcher = Matchers.getInstance().getMatcher(); // retrieves the default matcher
        defaultMatcher.configure(Properties);

        MappingStore mappings = defaultMatcher.match(src, dst); // computes the mappings between the trees

        // Iterating MappingStore mappings
        for (Mapping m : mappings){
            Tree srcNode = m.first;
            Tree dstNode = m.second;

            int start = srcNode.getPos();
            int end = srcNode.getEndPos();

            // System.out.println(rooto.substring(start, end));

            if ((rooto.substring(start, end).strip().equals(nodeo)) && start1 == start) {
                return new int[] {dstNode.getPos(), dstNode.getEndPos()};
            } 

        }

        return new int[] {};

     }  

    public static void main(String [] args) throws IOException {
        int[] r = PMadtcher("def get_args():\n\tparser = argparse.ArgumentParser()\n\targs = parser.parse_args()\n\targs = parse_db_config(args)", 
        "def get_args():\n\tparser = configargparse.ArgumentParser()\n\targs = parser.parse_args()\n\treturn parse_db_config(args)", "args = parser.parse_args()", 0, 1); 

        System.out.println(r[0]);
        System.out.println(r[1]);
    }
}