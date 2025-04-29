Import java.util.Scanner;
class employee {
String name,position; int number_of_years; double salary=30000;
employee(){
System.out.println("I am an employee");} void input(){
Scanner emp=new Scanner(System.in); System.out.println("NAME ="); name=emp.nextLine(); System.out.println("Position =");
position=emp.nextLine(); System.out.println("Number of years ="); number_of_years=emp.nextInt(); System.out.println("I am an employee");} void display(){
System.out.println("Name = "+name+" position = "+position+"number of years = "+number_of_years+"salary = "+salary);}}
class full_time_employee extends employee{ double increment =0.2; full_time_employee(){
super();
System.out.println("I am Full time employee");} void incremented_salary(){
System.out.println("Incremented Salary"+salary+(salary*increment));} class part_time_employee extends employee
double increment=0.05; part_time_employee(){ super();
System.out.println("I am part time employee");} void incremented_salary(){
System.out.println("Incremented Salary"+(salary*increment)+salary);} public class Lab_9 {
public static void main(String[] args) { full_time_employee e1=new full_time_employee(); e1.input();
 
e1.input(); e1.incremented_salary();
part_time_employee e2=new part_time_employee(); e2.input();
e2.display(); e2.incremented_salary();}}
