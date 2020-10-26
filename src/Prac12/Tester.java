package Prac12;

import java.util.Scanner;

public class Tester {
    public static String getLine(String filename){
        String s;
        char st;
        int frt, lst;
        boolean flag = true;
        StringBuilder sb = new StringBuilder(filename);
        while (flag){
            flag = false;
            frt = 0;
            lst = 0;
            s = "";
            for (int i = 0; i < filename.length(); i++){
                lst = i;
                if (sb.charAt(i) == ' '){
                    if(!(Character.toLowerCase(sb.charAt(i-1)) == Character.toLowerCase(sb.charAt(i+1)))){
                        s = sb.substring(frt, lst+1);
                        st = sb.charAt(lst-1);
                        sb.delete(frt, lst+1);
                        if (sb.charAt(0) == st){
                            sb.insert(0, s);
                            flag = true;
                        }
                        else {
                            for (int j = 0; j < sb.length(); j++){
                                if (sb.charAt(j) == ' ') {
                                    if (Character.toLowerCase(sb.charAt(j+1)) == Character.toLowerCase(st)) {
                                        sb.insert(j+1, s);
                                        flag = true;
                                        break;
                                    }
                                }
                            }
                        }
                        if(!flag){
                            sb.append(" ");
                            sb.append(s.trim());
                            flag = true;
                        }
                        break;
                    }
                    else {
                        frt = i+1;
                    }
                }
            }
        }
        return sb.toString();
    }
    public static void main(String[] ar) {
        Person pr1 = new Person("Беликова");
        Person pr2 = new Person("Беликова", "Полина", "Юреьвна");
        Address adr = new Address("Россия, Белгородская область, г.Губкин, ул.Раевского " +
                "дом 2. кв. 59");
        Number nm1 = new Number("+79175655655");
        Number nm2 = new Number("89175655655");
        Shirt sh = new Shirt();
        System.out.println(pr1.getFCS());
        System.out.println(pr2.getFCS());
        System.out.println(adr);
        System.out.println(sh);
        System.out.println(nm1);
        System.out.println(nm2);

        // Решение должно быть. (Пример: Pf St qs tp -> qs St tp Pf)
        Scanner sc = new Scanner(System.in);
        String filename = sc.nextLine();
        System.out.println(getLine(filename));

    }
}