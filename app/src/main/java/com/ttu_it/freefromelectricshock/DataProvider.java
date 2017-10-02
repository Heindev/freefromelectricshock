package com.ttu_it.freefromelectricshock;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class DataProvider {

    public static LinkedHashMap<String, List<String>> getInfo()
    {
        LinkedHashMap<String, List<String>> ArticleDetails = new LinkedHashMap<String, List<String>>();

        List<String> Article_One = new ArrayList<String>();
        Article_One.add("လျှပ်စစ်အန္တရာယ်");
        List<String> Article_Two = new ArrayList<String>();
        Article_Two.add("လျှပ်စစ်အန္တရာယ် ရှိနိုင်သည့် ဗို့အား");
        List<String> Article_Three= new ArrayList<String>();
        Article_Three.add("လျှပ်စစ်အန္တရာယ် ဖြစ်ပွားရခြင်း အကြောင်းရင်းများ");
        List<String> Article_Four=new ArrayList<String>();
        Article_Four.add("ဆားဗစ်ဝါယာကြိုး တပ်ဆင်အသုံးပြုရာတွင်  သတိပြုရန်အချက်များ");
        List<String> Article_Five = new ArrayList<String>();
        Article_Five.add("အများပြည်သူလျှပ်စစ်အန္တရာယ်ကင်းရှင်းရေးအတွက် တားမြစ်ချက်များ");
        List<String> Article_Six= new ArrayList<String>();
        Article_Six.add("အများပြည်သူ လျှပ်စစ်အန္တရာယ်ကင်းရှင်းရေးအတွက် အကြံပြုချက်များ");

        ArticleDetails.put("လျှပ်စစ်အန္တရာယ်",Article_One);
        ArticleDetails.put("လျှပ်စစ်အန္တရာယ် ရှိနိုင်သည့် ဗို့အား",Article_Two);
        ArticleDetails.put("လျှပ်စစ်အန္တရာယ် ဖြစ်ပွားရခြင်း အကြောင်းရင်းများ",Article_Three);
        ArticleDetails.put("ဆားဗစ်ဝါယာကြိုး တပ်ဆင်အသုံးပြုရာတွင်  သတိပြုရန်အချက်များ",Article_Four);
        ArticleDetails.put("အများပြည်သူလျှပ်စစ်အန္တရာယ်ကင်းရှင်းရေးအတွက် တားမြစ်ချက်များ",Article_Five);
        ArticleDetails.put("အများပြည်သူ လျှပ်စစ်အန္တရာယ်ကင်းရှင်းရေးအတွက် အကြံပြုချက်များ",Article_Six);
        return ArticleDetails;

    }

}

