var TimeID = null;
var flag = false;
var i;
//触发添加
function AddCdt(){
    var country1 = $("#country1").val();
    var country2 = $("#country2").val();
    var captial1 = $("#captial1").val();
    var captial2 = $("#captial2").val();
    $.ajax({
        url: "/AddCdt",
        type: "post",
        data:{"country1":country1,"country2":country2,"captial1":captial1,"captial2":captial2},
        success: function(data) {

            $.alert('添加成功！', function () {
                window.location.href = "/guanliyuan";
            });
        },
        error:function(){
            $.alert("添加失败，请稍后再试！");
        }
    });
}

//触发删除
function DeleteCdt(){
    var country1 = $("#country1").val();
    $.ajax({
        url: "/DeleteCdt",
        type: "post",
        data:{"country1":country1},
        success: function(data) {

            $.alert('删除成功！', function () {
                window.location.href = "/guanliyuan";
            });
        },
        error:function(){
            $.alert("删除失败，请稍后再试！");
        }
    });
}

//触发修改
function AlterCdt(){
    var oldcountry = $("#oldcountry").val();
    var country1 = $("#country1").val();
    var country2 = $("#country2").val();
    var captial1 = $("#captial1").val();
    var captial2 = $("#captial2").val();
    $.ajax({
        url: "/AlterCdt",
        type: "post",
        data:{"oldcountry":oldcountry,"country1":country1,"country2":country2,"captial1":captial1,"captial2":captial2},
        complete: function(XMLHttpRequest, textStatus) {
            console.log(XMLHttpRequest);
            console.log(textStatus);
        },
        success: function(data) {
            console.log(data);
            $.alert('修改成功！', function () {
                window.location.href = "/guanliyuan";
            });
        },
        error:function(){
            $.alert("修改失败，请稍后再试！");
        }
    });
}


//网页端返回
function AddCdt1(){
    var country1 = $("#country1").val();
    var country2 = $("#country2").val();
    var captial1 = $("#captial1").val();
    var captial2 = $("#captial2").val();
    $.ajax({
        url: "/AddCdt",
        type: "post",
        data:{"country1":country1,"country2":country2,"captial1":captial1,"captial2":captial2},
        success: function(data) {

            $.alert('添加成功！', function () {
                window.location.href = "/guanliyuan1";
            });
        },
        error:function(){
            $.alert("添加失败，请稍后再试！");
        }
    });
}

//触发删除
function DeleteCdt1(){
    var country1 = $("#country1").val();
    $.ajax({
        url: "/DeleteCdt",
        type: "post",
        data:{"country1":country1},
        success: function(data) {

            $.alert('删除成功！', function () {
                window.location.href = "/guanliyuan1";
            });
        },
        error:function(){
            $.alert("删除失败，请稍后再试！");
        }
    });
}

//触发修改
function AlterCdt1(){
    var oldcountry = $("#oldcountry").val();
    var country1 = $("#country1").val();
    var country2 = $("#country2").val();
    var captial1 = $("#captial1").val();
    var captial2 = $("#captial2").val();
    $.ajax({
        url: "/AlterCdt",
        type: "post",
        data:{"oldcountry":oldcountry,"country1":country1,"country2":country2,"captial1":captial1,"captial2":captial2},
        complete: function(XMLHttpRequest, textStatus) {
            console.log(XMLHttpRequest);
            console.log(textStatus);
        },
        success: function(data) {
            console.log(data);
            $.alert('修改成功！', function () {
                window.location.href = "/guanliyuan1";
            });
        },
        error:function(){
            $.alert("修改失败，请稍后再试！");
        }
    });
}


//搜索
function souSuo(){
    var search = $("#search").val();
    $.ajax({
        url: "/souSuo",
        type: "post",
        data:{"search":search},
        complete:function(XMLHttpRequest, textStatus){
           console.log(textStatus);
        },
        success: function(data) {
            console.log(data);
            data1 = JSON.parse(data);
            $("#country11").html(data1.country1);
            $("#country22").html(data1.country2);
            $("#captial11").html(data1.captial1);
            $("#captial22").html(data1.captial2);
        },
        error:function(){
            $.alert("查询失败");
        }
    });
}

//搜索
function souSuo1(){
    var search = $("#search").val();
    $.ajax({
        url: "/souSuo",
        type: "post",
        data:{"search":search},
        complete:function(XMLHttpRequest, textStatus){
            console.log(textStatus);
        },
        success: function(data) {
            console.log(data);
            data1 = JSON.parse(data);
            $("#country11").html(data1.country1);
            $("#country22").html(data1.country2);
            $("#captial11").html(data1.captial1);
            $("#captial22").html(data1.captial2);
        },
        error:function(){
            $.alert("查询失败");
        }
    });
}

//开始轮播
function start1()
{
    $.ajax({
        url:'/start',
        type:'post',
        success:function (data) {
            var str = '[{"country1":"加蓬","country2":"Gabon","captial1":"利伯维尔","captial2":"Libreville"},{"country1":"匈牙利","country2":"Hungary","captial1":"布达佩斯","captial2":"budapest"},{"country1":"北马里亚纳群岛","country2":"Northern Mariana Islands","captial1":"塞班","captial2":"Saipan"},{"country1":"南斯拉夫","country2":"Serbia and Montenegro","captial1":"贝尔格莱德","captial2":"Belgrade"},{"country1":"南苏丹","country2":"South Sudan","captial1":"朱巴","captial2":"Juba"},{"country1":"南非","country2":"South Africa","captial1":"比勒陀利亚","captial2":"Pretoria"},{"country1":"博茨瓦纳","country2":"Botswana","captial1":"哈博罗内","captial2":"Gaborone"},{"country1":"卡塔尔","country2":"Katar","captial1":"多哈","captial2":"Doha"},{"country1":"卢旺达","country2":"Rwanda","captial1":"基加利","captial2":"Kigali"},{"country1":"卢森堡","country2":"Luxembourg","captial1":"卢森堡","captial2":"Luxembourg"},{"country1":"印度","country2":"India","captial1":"新德里","captial2":"New Delhi"},{"country1":"印度尼西亚","country2":"Indonesia","captial1":"雅加达","captial2":"Jakarta"},{"country1":"危地马拉","country2":"Guatemala","captial1":"危地马拉","captial2":"Guatemala"},{"country1":"厄瓜多尔","country2":"Ecuador","captial1":"基多","captial2":"Quito"},{"country1":"厄立特里亚","country2":"Eritrea","captial1":"阿斯马拉","captial2":"Asmara"},{"country1":"叙利亚","country2":"Syria","captial1":"大马士革","captial2":"Damascus"},{"country1":"古巴","country2":"Cuba","captial1":"哈瓦那","captial2":"Havana"},{"country1":"吉尔吉斯斯坦","country2":"Kyrgyzstan","captial1":"比什凯克","captial2":"Bishkek"},{"country1":"吉布提","country2":"Djibouti","captial1":"吉布提","captial2":"Djibouti"},{"country1":"哈萨克斯坦","country2":"Kazakhstan","captial1":"阿斯塔纳","captial2":"Astana"},{"country1":"哥伦比亚","country2":"Columbia","captial1":"圣菲波哥大","captial2":"Santa fe Bogota"},{"country1":"哥斯达黎加","country2":"Costa Rica","captial1":"圣何塞","captial2":"San Jose"},{"country1":"喀麦隆","country2":"Cameroon","captial1":"雅温得","captial2":"Yaoundé"},{"country1":"图瓦卢","country2":"Tuvalu","captial1":"维拉港","captial2":"port vila"},{"country1":"土库曼斯坦","country2":"Turkmenistan","captial1":"阿什哈巴德","captial2":"Ashkhabad"},{"country1":"土耳其","country2":"turkey","captial1":"安卡拉","captial2":"Ankara"},{"country1":"圣卢西亚","country2":"Saint Lucia","captial1":"卡斯特里","captial2":"castries"},{"country1":"圣多美和普林西比","country2":"Sao Tome and Principe","captial1":"圣多美","captial2":"Sao Tome"},{"country1":"圣赫勒拿","country2":"Saint Helena","captial1":"詹姆斯敦","captial2":"jamestown"},{"country1":"圣马力诺","country2":"San Marino","captial1":"圣马力诺","captial2":"San Marino"},{"country1":"圭亚那","country2":"Guyana","captial1":"乔治敦","captial2":"Georgetown"},{"country1":"坦桑尼亚","country2":"Tanzania","captial1":"达累斯萨拉姆","captial2":"Dar-es-Salaam"}]';
            console.log(str);
            var JsonStr = JSON.parse(str);
             if(flag==false){
                 i = Math.floor((Math.random()*30)+1);
                 $('#lunbo_country1').html(JsonStr[i].country1);
                 $('#lunbo_country2').html(JsonStr[i].country2);
                 $('#lunbo_captial1').html(JsonStr[i].captial1);
                 $('#lunbo_captial2').html(JsonStr[i].captial2);
                 i++;
                 flag=true;
             }
             console.log(flag+","+i);
            TimeID =setInterval(function () {
                 $('#lunbo_country1').html(JsonStr[i].country1);
                 $('#lunbo_country2').html(JsonStr[i].country2);
                 $('#lunbo_captial1').html(JsonStr[i].captial1);
                 $('#lunbo_captial2').html(JsonStr[i].captial2);
                 if(i==JsonStr.length-1){
                     i=0;
                 }
                 i++;
             },2500)
        }
    })
}

//暂停轮播
function pause1()
{
    clearInterval(TimeID);
}

function KeFu() {
    alert("请拨打：18318684040");
}
