public class testreplace {
    public static void main(String[] args) {
        String str="This is my Test, This is their Test, This is others Test";
        String[] newStr=str.split(",");
        String [] res;
        for (int i=0;i< newStr.length;i++){
            if (newStr[i].contains("Test") && newStr[i].contains("This")){
                newStr[i]=newStr[i].replaceAll("This",  "sihT");
                newStr[i]=newStr[i].replaceAll("Test",  "tesT");
                System.out.print(newStr[i]+",");
            }
        }
        System.out.println();
    }
}
