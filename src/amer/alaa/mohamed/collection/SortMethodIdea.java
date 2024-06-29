package amer.alaa.mohamed.collection;

public class SortMethodIdea {
    /*
     * دالة ال sort تستخدم علشان تعدل علي ال object من خلال انك هتباصي ال
     * reference  تبع هذا ال object
     * */
    public static class Man {
        private String name;
        private String address;

        public Man(String name, String address) {
            this.name = name;
            this.address = address;
        }

    }

    public static void modifyingObjectValues(Man man, String newName) {
        man.name = newName;
    }

    public static void
    main(String[] args) {
        Man man = new Man("Mohame Alaa amer ","Cairo , Egypt ");
        System.out.println(man.name);

        // we will call the ModifyingFunction
        modifyingObjectValues(man, "Mostafa Amer ");
        System.out.println(man.name);
        System.out.println(man.address);

        System.out.println(man.name);
        System.out.println(man.address);
    }
    /*
    * iهي دي فكرة عمل ال sort()
    * الموجودة عندنا في ال Collections  كلاس
    * هنعدل علي قيمة ال object من خلال انك هتباصي ال reference  للدالة
    *
    * */

}
