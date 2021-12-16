package flyproject.flytranslate;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        List<String> code = new ArrayList();
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        list.add("南非荷兰语");
        list.add("阿尔巴尼亚语");
        list.add("阿姆哈拉语");
        list.add("阿拉伯语");
        list.add("亚美尼亚语");
        list.add("阿塞拜疆语");
        list.add("巴斯克语");
        list.add("白俄罗斯语");
        list.add("孟加拉语");
        list.add("波斯尼亚语");
        list.add("保加利亚语");
        list.add("加泰罗尼亚语");
        list.add("宿务语");
        list.add("繁体");
        list.add("中文");
        list.add("科西嘉语");
        list.add("克罗地亚语");
        list.add("捷克语");
        list.add("丹麦语");
        list.add("荷兰语");
        list.add("英语");
        list.add("世界语");
        list.add("爱沙尼亚语");
        list.add("芬兰语");
        list.add("法语");
        list.add("弗里斯兰语");
        list.add("加利西亚语");
        list.add("格鲁吉亚语");
        list.add("德语");
        list.add("希腊语");
        list.add("古吉拉特语");
        list.add("海地克里奥尔语");
        list.add("豪萨语");
        list.add("夏威夷语");
        list.add("希伯来语");
        list.add("印地语");
        list.add("苗语");
        list.add("匈牙利语");
        list.add("冰岛语");
        list.add("伊博语");
        list.add("印度尼西亚语");
        list.add("爱尔兰语");
        list.add("意大利语");
        list.add("日语");
        list.add("爪哇语");
        list.add("卡纳达语");
        list.add("哈萨克语");
        list.add("高棉语");
        list.add("卢旺达语");
        list.add("韩语");
        list.add("库尔德语");
        list.add("吉尔吉斯语");
        list.add("老挝文");
        list.add("拉脱维亚语");
        list.add("立陶宛语");
        list.add("卢森堡语");
        list.add("马其顿语");
        list.add("马尔加什语");
        list.add("马来语");
        list.add("马拉雅拉姆文");
        list.add("马耳他语");
        list.add("毛利语");
        list.add("马拉地语");
        list.add("蒙古文");
        list.add("缅甸语");
        list.add("尼泊尔语");
        list.add("挪威语");
        list.add("尼杨扎语");
        list.add("奥里亚语");
        list.add("普什图语");
        list.add("波斯语");
        list.add("波兰语");
        list.add("葡萄牙语");
        list.add("旁遮普语");
        list.add("罗马尼亚语");
        list.add("俄语");
        list.add("萨摩亚语");
        list.add("苏格兰盖尔语");
        list.add("塞尔维亚语");
        list.add("塞索托语");
        list.add("修纳语");
        list.add("信德语");
        list.add("僧伽罗语");
        list.add("斯洛伐克语");
        list.add("斯洛文尼亚语");
        list.add("索马里语");
        list.add("西班牙语");
        list.add("巽他语");
        list.add("斯瓦希里语");
        list.add("瑞典语");
        list.add("塔加路语");
        list.add("塔吉克语");
        list.add("泰米尔语");
        list.add("鞑靼语");
        list.add("泰卢固语");
        list.add("泰文");
        list.add("土耳其语");
        list.add("土库曼语");
        list.add("乌克兰语");
        list.add("乌尔都语");
        list.add("维吾尔语");
        list.add("乌兹别克语");
        list.add("越南语");
        list.add("威尔士语");
        list.add("班图语");
        list.add("意第绪语");
        list.add("约鲁巴语");
        list.add("祖鲁语");
        while (true){
            String input = sc.next();
            if (input.equals("[end]")){
                for (int i = 0;i < list.size();i++){
                    sb.append("map.put(\"" + list.get(i) + "\",\"" + code.get(i) + "\");\n");
                }
                System.out.println(sb.toString());
                setSysClipboardText(sb.toString());
                break;
            }
            code.add(input);

        }

    }
    public static void setSysClipboardText(String writeMe) {
        Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
        Transferable tText = new StringSelection(writeMe);
        clip.setContents(tText, null);
    }
}
