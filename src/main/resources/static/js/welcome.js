$(document).ready(function() {

       console.log("document loaded");
       $.ajax({url: "/TestReports/getDistinctDates", success: function(result){
           $("#distinctdates").append(new Option("Select Date", "Select Date", true, true));
            for (var i = result.length; i > 0; i--) {
               var newOption = new Option(result[i-1], result[i-1], false, false);
               $("#distinctdates").append(newOption);
           }
         }
        })

       $('#distinctdates').change(function() {
                testplanresults();
        });

        $('.table').on("click","#tablebody tr td a" ,function(){
                                var data=$(this).text();
                                console.log(data);
                           });

      });

      function testplanresults(){
               var dateval=$('#distinctdates').children("option:selected").val();
          $.ajax({url: "/TestReports/testplanresults?date="+dateval, success: function(result){
                   $(".table").children().remove();
                   $(".table").append("<thead class=thead-dark><tr><th scope=col>planid</th><th scope=col>planname</th><th scope=col>createdtime</th> <th scope=col>endtime</th> <th scope=col>executiontime</th><th scope=col>passcount</th><th scope=col>failcount</th> <th scope=col>skipcount</th><th scope=col>totaltests</th></tr></thead>");
                       for (var i = 0; i < result.length; i++) {
                       console.log(result[i].testcaseid);
                       $(".table").append("<tbody id=tablebody><tr><td><a>"+result[i].planid+"</a></td><td>"+result[i].planname+"</td><td>"+result[i].createdtime+"</td><td>"+result[i].endtime+"</td><td>"+result[i].executiontime+" min</td> <td>"+result[i].passcount+"</td><td>"+result[i].failcount+"</td><td>"+result[i].skipcount+"</td><td>"+result[i].totaltests+"</td></tr></tbody>");
                       }


            }
            })
            }





