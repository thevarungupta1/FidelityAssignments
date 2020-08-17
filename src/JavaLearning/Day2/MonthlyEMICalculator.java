package JavaLearning.Day2;
public class MonthlyEMICalculator {
    public static void main(String[] args) {
            double principal =2500 ;
            double rate = 2 ;
            double time = 1 ;

            rate=rate/(12*100);
            time=time*12;

            double emi= (principal*rate*Math.pow(1+rate,time))/(Math.pow(1+rate,time)-1);
            System.out.println(" Monthly EMI is : "+emi+"\n");
        }
    }
