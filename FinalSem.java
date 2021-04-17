import java.io.*;
class Cia
{
      double cm;
      void get_ciamarks() throws IOException
      {
              BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
              String str=br.readLine();
              System.out.println("Enter CIA Marks Out Of 20:");
              cm=Double.parseDouble(str);
      }
}
class EndSem extends Cia
{
      double em;
      void get_marks() throws IOExceptiob
      {
              super.get_ciamarks();
              BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
              String str1=br.readLine();
              System.out.println("Enter Endsem Marks out of 80:");
              em=Double.parseDouble(str1);
       }
}
public class FinalSem extends EndSem
{
       public static void main(String args[]) throws IOException
       {
             double result;
             EndSem obj=new EndSem();
             obj.get_marks();
             result=obj.em+obj.cm;
             System.out.println("Result Is: "+result);
        }
}


