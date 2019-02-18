package item;

import java.awt.*;

public class Fonts {

    public static Font getFontH1Bold(){
        Font font=null;
        if (ScreenSize.scr_width>=2160){

            font=new Font("Microsoft YaHei UI",Font.BOLD,40);

        }else if (ScreenSize.scr_width<2160&ScreenSize.scr_width>=1600){

            font=new Font("Microsoft YaHei UI",Font.BOLD,28);

        }else if(ScreenSize.scr_width<1600){

            font=new Font("Microsoft YaHei UI",Font.BOLD,18);
        }
        return font;
    }

    public static Font getFontH2Bold(){
        Font font=null;
        if (ScreenSize.scr_width>=2160){

            font=new Font("Microsoft YaHei UI",Font.BOLD,32);

        }else if (ScreenSize.scr_width<2160&ScreenSize.scr_width>=1600){

            font=new Font("Microsoft YaHei UI",Font.BOLD,24);

        }else if(ScreenSize.scr_width<1600){

            font=new Font("Microsoft YaHei UI",Font.BOLD,15);
        }
        return font;
    }

    public static Font getSymbolH0(){
        Font font=null;
        if (ScreenSize.scr_width>=2160){

            font=(new Font("Microsoft YaHei UI",Font.PLAIN,50));

        }else if (ScreenSize.scr_width<2160&ScreenSize.scr_width>=1600){

            font=(new Font("Microsoft YaHei UI",Font.PLAIN,40));

        }else if(ScreenSize.scr_width<1600){

            font=(new Font("Microsoft YaHei UI",Font.PLAIN,24));
        }
        return font;
    }

    public static Font getSymbolHmax(){
        Font font=null;
        if (ScreenSize.scr_width>=2160){

            font=(new Font("等线",Font.PLAIN,80));

        }else if (ScreenSize.scr_width<2160&ScreenSize.scr_width>=1600){

            font=(new Font("等线",Font.PLAIN,60));

        }else if(ScreenSize.scr_width<1600){

            font=(new Font("等线",Font.PLAIN,40));
        }
        return font;
    }

    public static Font getFontStandard(){
        Font font=null;
        if (ScreenSize.scr_width>=2160){
            font=(new Font("Microsoft YaHei UI",Font.PLAIN,28));  //设置顶部标签字体
        }
        if (ScreenSize.scr_width<2160&ScreenSize.scr_width>=1600){
            font=(new Font("Microsoft YaHei UI",Font.PLAIN,20));
        }
        if (ScreenSize.scr_width<1600){
            font=(new Font("Microsoft YaHei UI",Font.PLAIN,12));
        }
        return font;

    }


}
