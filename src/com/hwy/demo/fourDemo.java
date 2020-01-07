package com.hwy.demo;

public class fourDemo {

    public static void main(String [] args){
        String  req = "{\n" +
                "  \"businessParams\": {\n" +
                "    \"amount\": 1,\n" +
                "    \"responseList\": [\n" +
                "      {\n" +
                "        \"campPlanTargCode\": \"0107242798354\",\n" +
                "        \"children\": [\n" +
                "          {\n" +
                "            \"campPlanTargCode\": \"0107242832353\",\n" +
                "            \"children\": [],\n" +
                "            \"compRate\": \"25.00%\",\n" +
                "            \"compRateRank\": \"2\",\n" +
                "            \"compValue\": \"2.00(户)\",\n" +
                "            \"compValueRank\": \"2\",\n" +
                "            \"districtName\": \"山东省\",\n" +
                "            \"launchDeptName\": \"中国邮政集团公司\",\n" +
                "            \"normDesc\": \"累计有效户描述。\",\n" +
                "            \"normName\": \"累计有效户\",\n" +
                "            \"normRangeScope\": \"东营东四路证券营业部;山东分公司直属营业部;青岛分公司直属营业部\",\n" +
                "            \"productName\": \"普通业务\",\n" +
                "            \"receiveDeptName\": \"山东分公司\",\n" +
                "            \"targetValue\": \"8.0(户)\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"campPlanTargCode\": \"0107242835746\",\n" +
                "            \"children\": [],\n" +
                "            \"compRate\": \"37.50%\",\n" +
                "            \"compRateRank\": \"1\",\n" +
                "            \"compValue\": \"3.00(户)\",\n" +
                "            \"compValueRank\": \"1\",\n" +
                "            \"districtName\": \"陕西省\",\n" +
                "            \"launchDeptName\": \"中国邮政集团公司\",\n" +
                "            \"normDesc\": \"累计有效户描述。\",\n" +
                "            \"normName\": \"累计有效户\",\n" +
                "            \"normRangeScope\": \"西安南大街营业部;西安电子二路营业部;阎良人民路营业部;咸阳团结路营业部;渭南东风街营业部;汉中西环路营业部;宝鸡高新大道营业部\",\n" +
                "            \"productName\": \"普通业务\",\n" +
                "            \"receiveDeptName\": \"陕西分公司\",\n" +
                "            \"targetValue\": \"8.0(户)\"\n" +
                "          }\n" +
                "        ],\n" +
                "        \"compRate\": \"50.00%\",\n" +
                "        \"compRateRank\": \"\",\n" +
                "        \"compValue\": \"5.00(户)\",\n" +
                "        \"compValueRank\": \"\",\n" +
                "        \"districtName\": \"全国\",\n" +
                "        \"launchDeptName\": \"中国邮政集团公司\",\n" +
                "        \"normDesc\": \"累计有效户描述。\",\n" +
                "        \"normName\": \"累计有效户\",\n" +
                "        \"normRangeScope\": \"东营东四路证券营业部;郴州证券营业部;西安南大街营业部;北京宣武门东大街营业部;西安电子二路营业部;阎良人民路营业部;咸阳团结路营业部;渭南东风街营业部;汉中西环路营业部;宝鸡高新大道营业部;成都高新区证券营业部;厦门东港北路证券营业部;无锡县前东街证券营业部;赣州登峰大道证券营业部;深圳分公司直属营业部;山东分公司直属营业部;江苏分公司直属营业部;四川分公司直属营业部;江西分公司直属营业部;湖北分公司直属营业部;湖南分公司直属营业部;福建分公司直属营业部;辽宁分公司直属营业部;吉林分公司直属营业部;黑龙江分公司直属营业部;浙江分公司直属营业部;广东分公司直属营业部;贵州分公司直属营业部;新疆分公司直属营业部;河南分公司直属营业部;山西分公司直属营业部;青岛分公司直属营业部;上海分公司直属营业部\",\n" +
                "        \"productName\": \"普通业务\",\n" +
                "        \"receiveDeptName\": \"\",\n" +
                "        \"targetValue\": \"10.0(户)\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"responseData\": {\n" +
                "      \"timeRate\": \"10%\",\n" +
                "      \"timeRemain\": \"17\",\n" +
                "      \"staticTime\": \"2019-01-07\"\n" +
                "    }\n" +
                "  },\n" +
                "  \"systemParams\": {\n" +
                "    \"responseInfos\": {\n" +
                "      \"responseCode\": \"0\",\n" +
                "      \"responseMsg\": \"OK\"\n" +
                "    }\n" +
                "  }\n" +
                "}";
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.lastIndexOf("responseData"));
        sb.delete(sb.lastIndexOf(","),sb.length());
        System.out.print(sb.toString());
    }
}
