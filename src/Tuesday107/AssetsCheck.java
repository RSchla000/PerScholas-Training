package Tuesday107;

public class AssetsCheck {
    void checkAssetsVsLiabilities(int assets, int liabilities){

        String result = (assets > liabilities)
                ? "Assets are greater then Liabilities" : "Assets are not greater then Liabilities";
        System.out.println(result);
    }

    static void main(String[] args) {
        AssetsCheck ac = new AssetsCheck();

        int assets = 100;
        int liabilities = 40;
        ac.checkAssetsVsLiabilities(assets,liabilities);
    }
}
