package it.unicam.cs.followme.utilities;

import java.util.stream.IntStream;

@FunctionalInterface
public interface FollowMeShapeChecker {

    boolean checkParameters(String[] args);

    FollowMeShapeChecker DEFAULT_CHECKER = (args) ->
            (args.length>2)&&
                    (((args[1].equals("CIRCLE"))&&(args.length==5)) ||((args[1].equals("RECTANGLE"))&&(args.length==6)))
                    &&(IntStream.range(2,args.length).allMatch(i -> isDouble(args[i])));

    private static boolean isDouble(String str) {
        try {
            return Double.isFinite(Double.parseDouble(str));
        } catch (NumberFormatException e){
            return false;
        }
    }

}
