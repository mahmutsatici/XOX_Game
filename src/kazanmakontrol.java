public class kazanmakontrol extends Main {

    public int kazanmakontrol(String a1,String a2,String a3,String b1,String b2,String b3,String c1,String c2,String c3) {

        String matris[][]={{a1,a2,a3},{b1,b2,b3},{c1,c2,c3}};

        if((matris[0][0]==matris[0][1] && matris[0][1]== matris[0][2])||(matris[1][0]==matris[1][1] && matris[1][1]== matris[1][2])||(matris[2][0]==matris[2][1] && matris[2][1]== matris[2][2]) )
        {
            //satır kontrolü
            return 1;
        }
        else if ((matris[0][0]==matris[1][0] && matris[1][0]== matris[2][0])||(matris[0][1]==matris[1][1] && matris[1][1]== matris[2][1])||(matris[0][2]==matris[1][2] && matris[1][2]== matris[2][2]) ) {
            //sütun kontrolü
            return 1;
        }
        else if ((matris[0][0]==matris[1][1] && matris[1][1]== matris[2][2])||(matris[0][2]==matris[1][1] && matris[1][1]== matris[2][0])){

            //çapraz kontrolü
            return 1;
        }
        else {return 0;}



    }
}
