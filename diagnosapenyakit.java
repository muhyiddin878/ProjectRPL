package com.example.muhyiddin878.gastricdiseasediagnosis;

/**
 * Created by muhyiddin878 on 11/11/17.
 */

public class diagnosapenyakit {


    Soal soal[] = KuisionerActivity.soal;

    //maag
    private  double cfu1;
    private  double cfu2;
    private  double cfu3;
    private  double cfu4;
    private  double cfu5;

    private double cfp1;
    private double cfp2;
    private double cfp3;
    private double cfp4;
    private double cfp5;

    //disper
    private double cfud1;
    private double cfud2;
    private double cfud3;
    private double cfud4;
    private double cfud5;
    private double cfud6;
    private double cfud7;
    private double cfud8;
    private double cfud9;

    private  double cfd1;
    private  double cfd2;
    private  double cfd3;
    private  double cfd4;
    private  double cfd5;
    private  double cfd6;
    private  double cfd7;
    private  double cfd8;
    private  double cfd9;

    //gerd
    private  double cfuger1;
    private  double cfuger2;
    private  double cfuger3;
    private  double cfuger4;
    private  double cfuger5;
    private  double cfuger6;
    private  double cfuger7;
    private  double cfuger8;
    private  double cfuger9;


    private double cfg1;
    private double cfg2;
    private double cfg3;
    private double cfg4;
    private double cfg5;
    private double cfg6;
    private double cfg7;
    private double cfg8;
    private double cfg9;


    public diagnosapenyakit(){

        //maag
        cfu1 = soal[0].getJawaban();
        cfu2= soal[1].getJawaban();
        cfu3= soal[2].getJawaban();
        cfu4= soal[3].getJawaban();
        cfu5= soal[4].getJawaban();

        cfp1= 0.4;
        cfp2= 1.0;
        cfp3= 0.4;
        cfp4= 0.4;
        cfp5= 0.6;


      //disper
        cfud1= soal[0].getJawaban();
        cfud2= soal[2].getJawaban();
        cfud3=soal[3].getJawaban();
        cfud4=soal[4].getJawaban();
        cfud5=soal[5].getJawaban();
        cfud6=soal[6].getJawaban();
        cfud7=soal[7].getJawaban();
        cfud8=soal[8].getJawaban();
        cfud9=soal[12].getJawaban();

        cfd1=0.1;
        cfd2=0.4;
        cfd3=0.4;
        cfd4=0.2;
        cfd5=0.4;
        cfd6=0.4;
        cfd7=0.4;
        cfd8=0.1;
        cfd9=0.4;


        //gerd

        cfuger1=soal[0].getJawaban();
        cfuger2=soal[3].getJawaban();
        cfuger3=soal[5].getJawaban();
        cfuger4=soal[9].getJawaban();
        cfuger5=soal[10].getJawaban();
        cfuger6=soal[11].getJawaban();
        cfuger7=soal[12].getJawaban();
        cfuger8=soal[13].getJawaban();
        cfuger9=soal[14].getJawaban();


        cfg1= 0.1;
        cfg2=0.4;
        cfg3=0.4;
        cfg4=0.4;
        cfg5=0.2;
        cfg6=0.4;
        cfg7=0.2;
        cfg8=0.2;
        cfg9=0.1;


    }

//milik maag
    private double cf1;
    private double cf2;
    private double cf3;
    private double cf4;
    private double cf5;
    private double resultmaag;

    private  double combine1;
    private  double combine2;
    private  double combine3;
    private  double combine4;








    //milik disper


    private double cfdis1;
    private double cfdis2;
    private double cfdis3;
    private double cfdis4;
    private double cfdis5;
    private double cfdis6;
    private double cfdis7;
    private double cfdis8;
    private double cfdis9;



    private  double combined1;
    private  double combined2;
    private  double combined3;
    private  double combined4;
    private  double combined5;
    private  double combined6;
    private  double combined7;
    private  double combined8;
    private double resultdisper;




    //milik GERD

    private double cfgerd1;
    private double cfgerd2;
    private double cfgerd3;
    private double cfgerd4;
    private double cfgerd5;
    private double cfgerd6;
    private double cfgerd7;
    private double cfgerd8;
    private double cfgerd9;




    private  double combineg1;
    private  double combineg2;
    private  double combineg3;
    private  double combineg4;
    private  double combineg5;
    private  double combineg6;
    private  double combineg7;
    private  double combineg8;
    private  double combined9;
    private double resultgerd;
//
//
//






    public double maag(){
        cf1= cfp1*cfu1;
        cf2= cfp2*cfu2;
        cf3= cfp3*cfu3;
        cf4= cfp4*cfu4;
        cf5= cfp5*cfu5;


        combine1= cf1+(cf2*(1-cf1));
        combine2= combine1+(cf3*(1-combine1));
        combine3= combine2+(cf4*(1-combine2));
        combine4= combine3+(cf5*(1-combine3));
        resultmaag = (combine4*100);

        return resultmaag;


    }

    public  double dispepsia(){
        cfdis1= cfud1*cfd1;
        cfdis2= cfud2*cfd2;
        cfdis3= cfud3*cfd3;
        cfdis4= cfud4*cfd4;
        cfdis5= cfud5*cfd5;
        cfdis6= cfud6*cfd6;
        cfdis7= cfud7*cfd7;
        cfdis8= cfud8*cfd8;
        cfdis9= cfud9*cfd9;


        combined1= cfdis1+cfdis2*(1-cfdis1);
        combined2 =combined1+cfdis3*(1-combined1);
        combined3=combined2+cfdis4*(1-combined2);
        combined4=combined3+cfdis5*(1-combined3);
        combined5=combined4+cfdis6*(1-combined4);
        combined6=combined5+cfdis7*(1-combined5);
        combined7=combined6+cfdis8*(1-combined6);
        combined8=combined7+cfdis9*(1-combined7);
        resultdisper= (combined8*100);

         return  resultdisper;
    }
//
//
//
    public double gerd(){
        cfgerd1= cfuger1*cfg1;
        cfgerd2= cfuger2*cfg2;
        cfgerd3= cfuger3*cfg3;
        cfgerd4 = cfuger4*cfg4;
        cfgerd5= cfuger5*cfg5;
        cfgerd6= cfuger6*cfg6;
        cfgerd7= cfuger7*cfg7;
        cfgerd8= cfuger8*cfg8;
        cfgerd9= cfuger9*cfg9;


        combineg1= cfgerd1+cfgerd2*(1-cfgerd1);
        combineg2 =combineg1+cfgerd3*(1-combineg1);
        combineg3=combineg2+cfgerd4*(1-combineg2);
        combineg4=combineg3+cfgerd5*(1-combineg3);
        combineg5=combineg4+cfgerd6*(1-combineg4);
        combineg6=combineg5+cfgerd7*(1-combineg5);
        combineg7=combineg6+cfgerd8*(1-combineg6);
        combineg8=combineg7+cfgerd9*(1-combineg7);
        resultgerd= (combineg8*100);



        return  resultgerd;
    }



}
