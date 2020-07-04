public class Main {

    public static void main(String[] args) {

        MyGenericInterface<Integer> dv = (Integer n) ->{   return n+n;  };
        System.out.println(dv.compute(34));


        MyGenericInterface2<Integer> dv2 =
                                (Integer n1, Integer n2) -> {
                                        return n1 + n2;
                                };
        System.out.println(dv2.compute(23,12));
    }
}
