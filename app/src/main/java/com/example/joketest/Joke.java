package com.example.joketest;

import java.util.List;

/**
 * Created by 杰 on 2018/1/16.
 */

public class Joke {

    /**
     * reason : Success
     * result : {"data":[{"content":"她：因为别人都不同情你，我才做你的妻子。他：你总算成功了。现在每个人都因此同情我。","hashId":"EA99E1CE63349DF7AA4712E820B59234","unixtime":1418745227,"updatetime":"2014-12-16 23:53:47"},{"content":"老婆把钱管得严，家里有个保险箱，密码只有她知道。有一天急用钱，向老婆申请，老婆批了，我问密码是多少。老婆说：\u201c我们初吻的日子\u201d。我没敢继续问，只好找朋友借钱了。","hashId":"E4C530E96D284793E76F3DD2CA1A7907","unixtime":1418745227,"updatetime":"2014-12-16 23:53:47"},{"content":"\u201c亲爱的，我现正在国际机场，准备赴新加坡参加一个学术研讨会\u2026\u2026\u201d\u201c我已登上飞机了，哦---我的小姐，你注意点啊----亲爱的，不好意思，刚才空姐不小心把茶溅到我身上了----\u201d\u201c是吗，那位空姐对你实在太好了，连你在飞机上打手机都没劝阻你，去死！嘟嘟嘟-----\u201d","hashId":"F611129E4A67F4AE5CD11819B6D5FE0C","unixtime":1418745227,"updatetime":"2014-12-16 23:53:47"},{"content":"一个男人周五下午离开家去上班。这天是发薪日，因此他没有回家，整个周末在外面与男人们狂欢，并花光了他的全部薪水。周日晚上他终于回到家里时，火冒三丈的妻子正等着他，连珠炮似的对他的所作所为骂了将近两个小时。最后，妻子停止了喋喋不休的责骂，问他：要是你也连着两三天见不到我，会作何感想？他回答说：我会感觉挺好的。周一过去了，他没看见妻子。周二和周三也过去了，他还是没有看见他妻子。到了周四\u2026\u2026肿消了一些，他终于勉强能从左眼角看到妻子一点点了\u2026\u2026","hashId":"771AC90167E260A5A783A13F08494B41","unixtime":1418745227,"updatetime":"2014-12-16 23:53:47"},{"content":"老公在上个东家那里还有最后一笔工资要领，因为他比较忙，而我比较闲，我要替他去领，被老公坚决拒绝。我以为他不想工资被\u201c充公\u201d呢，结果他半天才幽幽地说道:\u201c你不能去\u2026\u2026因为我已经在他们面前把你吹得跟天仙一样了\u2026\u2026\u201d","hashId":"B16E11E35C54B2CB2E2715CB7BF4A967","unixtime":1418745227,"updatetime":"2014-12-16 23:53:47"},{"content":"老公下班回家后，发现老婆躺在床上。老公关切地问道：老婆，身体不舒服吗？老婆点了点头。老公连忙安慰道：做饭的事你不用愁，我一会把你背到厨房！","hashId":"66C10A1595B2CF295034179161FDC2F9","unixtime":1418745227,"updatetime":"2014-12-16 23:53:47"},{"content":"老公今天发工资了，问我六千咱两怎么分，问我要多少？我本想他自己留着花吧，就说零。结果这个二货说：你把零拿走了，我岂不只剩下六百\u2026亲，你太自觉了好吗亲。","hashId":"8AF684B04882493C128602F11C7C8C85","unixtime":1418745227,"updatetime":"2014-12-16 23:53:47"},{"content":"有句话对所有男人说：\u201c和媳妇闹别扭，她哄你，见好就收吧，收不住就会变成你哄她了，角色立马转变\u2026得不偿失啊！\u201d","hashId":"D44DFB8241F49DA08E248F60908999EC","unixtime":1418745227,"updatetime":"2014-12-16 23:53:47"},{"content":"妻子：快点吃吧，不然饭馆的服务员要给咱们加菜了！丈夫：加什么菜？妻子：你没有看见邻桌上的鱼刺、鸡骨头都扫到咱们眼前来了？","hashId":"05D41CAACE705F07BC0DAAC5586C5BB1","unixtime":1418745227,"updatetime":"2014-12-16 23:53:47"},{"content":"夫被妻子盯得很紧，每日的薪金都如数交给妻子，只有一点刚够买香烟的零钱。一天，丈夫兴高采烈地回家，对妻子大叫：亲爱的，我中奖了！有5000元呢？妻子吃惊地问道：你哪里来的钱买彩票？","hashId":"CE9665A881C0516772304B32F0541724","unixtime":1418745227,"updatetime":"2014-12-16 23:53:47"}]}
     * error_code : 0
     */

    private String reason;
    private ResultBean result;
    private int error_code;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public static class ResultBean {
        private List<DataBean> data;

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean {
            /**
             * content : 她：因为别人都不同情你，我才做你的妻子。他：你总算成功了。现在每个人都因此同情我。
             * hashId : EA99E1CE63349DF7AA4712E820B59234
             * unixtime : 1418745227
             * updatetime : 2014-12-16 23:53:47
             */

            private String content;
            private String hashId;
            private int unixtime;
            private String updatetime;

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public String getHashId() {
                return hashId;
            }

            public void setHashId(String hashId) {
                this.hashId = hashId;
            }

            public int getUnixtime() {
                return unixtime;
            }

            public void setUnixtime(int unixtime) {
                this.unixtime = unixtime;
            }

            public String getUpdatetime() {
                return updatetime;
            }

            public void setUpdatetime(String updatetime) {
                this.updatetime = updatetime;
            }

        }
    }
}
