package com.flickerin.amy.customcodes;

public class GetFont {

    private String AppNameFont;
    private String AppRegularFont;
    private String AppSemiBoldFont;
    private String AppBoldFont;
    private String AppTitleFont;


    public GetFont(){
        this.AppNameFont="fonts/appfont.ttf";
        this.AppRegularFont="fonts/poppinsregular.ttf";
        this.AppBoldFont="fonts/poppinssemibold.ttf";
        this.AppSemiBoldFont="fonts/poppinsbold.ttf";
        this.AppTitleFont ="fonts/cocobiker.ttf";
    }

    public String getAppNameFont() {
        return this.AppNameFont;
    }

    public String getAppRegularFont() {
        return this.AppRegularFont;
    }

    public String getAppSemiBoldFont() {
        return this.AppSemiBoldFont;
    }

    public String getAppBoldFont() {
        return this.AppBoldFont;
    }

    public String getAppTitleFont() {
        return this.AppTitleFont;
    }
}
