package com.orbitsoft.teamorbitsoft.Gorji;

public class mohasebe implements gorjiGetArea {

    @Override
    public int mohit(int tool , int arz , int ghotr) {
        if(tool != 0 && arz !=0 ){
            int x = (tool+arz)*2;
            return x;
        }else {
            float x = ghotr * 3.14f;
            return (int) x;
        }
    }

    @Override
    public int masahat(int tool , int arz , int ghotr) {
        if(tool != 0 && arz !=0 ){
            int x = tool*arz;
            return x;
        }else {
            float x = 3.14f * (ghotr * ghotr / 4);
            return (int) x;
        }
    }


}
