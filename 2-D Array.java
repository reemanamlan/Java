import java.util.*;
public class Days {
public static void main(String[] args) {
int[][] hot;
   double  A=0;
System.out.println(" days' temperatures is ");
int days[][] = {{22,24,26,24,25,25,24,21,25,25,25,25,24,26,2,25,24,36,22,42,44,25,27,40,45,41,45,41,40,41,25},
  {22,24,26,24,25,25,24,21,25,25,25,25,24,26,2,25,24,36,22,42,44,25,27,40,45,41,45,41,40,41,25},
  {22,24,26,24,25,25,24,21,25,25,25,25,24,26,2,25,24,36,22,42,44,25,27,40,45,41,45,41,40,41,25},
  {22,24,26,24,25,25,24,21,25,25,25,25,24,26,2,25,24,36,22,42,44,25,27,40,45,41,45,41,40,41,25},
  {22,24,26,24,25,25,24,21,25,25,25,25,24,26,2,25,24,36,22,42,44,25,27,40,45,41,45,41,40,41,25},
  {22,24,26,24,25,25,24,21,25,25,25,25,24,26,2,25,24,36,22,42,44,25,27,40,45,41,45,41,40,41,25},
{22,24,26,24,25,25,24,21,25,25,25,25,24,26,2,25,24,36,22,42,44,25,27,40,45,41,45,41,40,41,25},
  {22,24,26,24,25,25,24,21,25,25,25,25,24,26,2,25,24,36,22,42,44,25,27,40,45,41,45,41,40,41,25},
{22,24,26,24,25,25,24,21,25,25,25,25,24,26,2,25,24,36,22,42,44,25,27,40,45,41,45,41,40,41,25},
  {22,24,26,24,25,25,24,21,25,25,25,25,24,26,2,25,24,36,22,42,44,25,27,40,45,41,45,41,40,41,25},
  {22,24,26,24,25,25,24,21,25,25,25,25,24,26,2,25,24,36,22,42,44,25,27,40,45,41,45,41,40,41,25},
   {22,24,26,24,25,25,24,21,25,25,25,25,24,26,2,25,24,36,22,42,44,25,27,40,45,41,45,41,40,41,25}};

 int sum = 0;
for (int i = 0; i < days.length; i++) { // read/store each day's temperature
for (int j = 0; j < days[i].length; j++) {
System.out.print("\t"+days[i][j]);
  sum += days[i][j];
  A =  sum / 12;
  A = A /days[i].length;
}
System.out.println("\n ");
 }
double average = A ;
int count = 0; // see if each day is above average
for (int i = 0; i < days.length; i++) {
 for (int j = 0; j < days[i].length; j++) {
if (days[i][j] > average) {
count++;
}
}}
System.out.printf("Average temp = %.1f\n", average);
System.out.println(count + " days above average");
 
System.out.print(" hot temp is  ") ;
    HashSet<Integer> set = new HashSet<>();
    for (int i = 0; i < days.length; i++) {
            for (int j = 0; j < days[i].length-1; j++) {
              if(days[i][j]>40 && days[i][j]!= days[i][j+1]){
             
  
            if (!set.contains(days[i][j]))
            {
                set.add(days[i][j]);
                System.out.print( days[i][j] + " "); }
                                           
 
       
           }
         
             
          }}
         System.out.print("\n cold temp is  ") ;
  
    for (int i = 0; i < days.length; i++) {
            for (int j = 0; j < days[i].length-1; j++) {
              if(days[i][j]<15 && days[i][j]!= days[i][j+1]){
             
            if (!set.contains(days[i][j]))
            {
                set.add(days[i][j]);
                System.out.println( days[i][j] + " "); }
                                           
 
       
           }
         
             
          }}
   System.out.println("Reema Mohammad Al Namlan");
   System.out.println(439802421);       
}
}
