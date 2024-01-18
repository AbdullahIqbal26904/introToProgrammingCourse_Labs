public class Hurricane {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        if(x < 74  ) {
            System.out.println("it does not qualify for Hurricane");
        }else {
            int ctg=0;
            if (x >= 74 && x <= 95) {
                ctg = 1;
            }
            if (x >= 96 && x <= 110) {
                ctg = 2;
            }
            if (x >= 111 && x <= 130) {
                ctg = 3;
            }
            if (x >= 131 && x <= 155) {
                ctg = 4;
            }
            if (x >= 156) {
                ctg = 5;
            }
            System.out.println("It qualifies for Hurricane and category is :" + " " + ctg);

        }

    }
    }
