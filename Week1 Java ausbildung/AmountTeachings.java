import java.util.*;

public class AmountTeachings {
    public static void main(String[] args) {


        Set<Integer> a = new HashSet<Integer>();
        a.addAll(Arrays.asList(
                new Integer[] { 49, 30, 14, 47, 13, 2, 12, 29, 19, 11, 15, 39, 43, 45, 34 }
        ));
        Set<Integer> b = new HashSet<Integer>();
        b.addAll(Arrays.asList(
                new Integer[]{ 39, 33, 38, 14, 4, 32, 40, 25, 17, 46, 35, 6, 2, 12, 49 }
        ));
        Set<Integer> c = new HashSet<Integer>();
        c.addAll(Arrays.asList(
                new Integer[]{ 41, 12, 5, 35, 42, 28, 47, 20, 26, 24, 50, 40, 14, 17, 10 }
        ));


       getUnionList(a,getIntersectionList(b,c));


    }
    public static Set<Integer> getUnionList(Set<Integer> a, Set<Integer> b){


       Set<Integer> unionAll = new HashSet<Integer>(a);
       unionAll.addAll(b);

       printUnion(unionAll);

       return unionAll;
    }
    public static void printUnion(Set<Integer> unionAll){
        System.out.println(unionAll);
    }

    public static Set<Integer> getDifferenceList(Set<Integer> a, Set<Integer> b){
        Set<Integer> differenceOf = new HashSet<>(a);
        differenceOf.removeAll(b);

        printDifference(differenceOf);

        return differenceOf;
    }
    public static void printDifference(Set<Integer> differenceOf){
        System.out.println(differenceOf);
    }

    public static Set<Integer> getIntersectionList(Set<Integer> a, Set<Integer> b){
        Set<Integer> Intersection = new HashSet<>(a);
        a.retainAll(b);

        printIntersection(Intersection);

        return Intersection;
    }
    public static void printIntersection(Set<Integer> Intersection){
        System.out.println(Intersection);
    }
}
