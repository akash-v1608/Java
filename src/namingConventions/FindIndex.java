package namingConventions;


class FindIndex
{
    static void findIndex(String inputText,String targetText)
    {
        StringBuilder sb=new StringBuilder(inputText);
        int index=sb.indexOf(targetText);
        if(index<0)
        {
            System.out.println("targetText not found in the givens inputText");

        }
        else
            System.out.println("targetText found at "+index+" in the given inputText");
    }
}
