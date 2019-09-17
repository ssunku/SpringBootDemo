    $(document).ready(function() {
       console.log("document loaded");

        $("#buildversion").change(function(){
        loadTestCaseData();
        });

         $(".table ").on("click","#tablebody tr" ,function(event){
                console.log(event);

                         loadTestCaseData(event);
            });

     var newOption = new Option("11.1", "11.1", true, true);
     var newOption1 = new Option("10.1", "10.1", true, true);
     $("#buildversion").append(newOption1);
      $("#buildversion").append(newOption);
     loadData();



    });

       function loadTestCaseData(event){
                  console.log(event);
            $.ajax({url: "/TestReports/testcaseresults", success: function(result){
                                   $(".table").children().remove();

                                   $(".table").append("<thead class=thead-dark>tr><th scope=col>planid</th><th scope=col>username</th><th scope=col>buildversion</th><th scope=col>classname</th><th scope=col>methodname</th><th scope=col>result</th><th scope=col>exception</th><th scope=col>executiontime</th><th scope=col>message</th> <th scope=col>failure_log</th></tr></thead>");
                                                       for (var i = 0; i < result.length; i++) {
                                                             console.log(result[i].testcaseid);
                                                             $(".table").append("<tbody id=tablebody><tr><td>"+result[i].planid+"</td><td>"+result[i].username+"</td><td>"+result[i].buildversion+"</td><td>"+result[i].classname+"</td><td>"+result[i].methodname+" min</td> <td>"+result[i].result+"</td><td>"+result[i].exception+"</td><td>"+result[i].executiontime+"</td><td>"+result[i].message+"</td><td>"+result[i].failure_log+"</td></tr></tbody>");
                                                       }

                                               }});

       }

  function loadData(){
          var environment = $('#buildversion').val();
          console.log("build version"+environment);
          if(environment && environment!=null && environment!=""){
              $.ajax({url: "/TestReports/testplanresults", success: function(result){
              $(".table").append("<thead class=thead-dark><tr><th scope=col>planid</th><th scope=col>planname</th><th scope=col>createdtime</th> <th scope=col>endtime</th> <th scope=col>executiontime</th><th scope=col>passcount</th><th scope=col>failcount</th> <th scope=col>skipcount</th><th scope=col>totaltests</th></tr></thead>");
                       for (var i = 0; i < result.length; i++) {
                       console.log(result[i].testcaseid);
                       $(".table").append("<tbody id=tablebody><tr><td>"+result[i].planid+"</td><td>"+result[i].planname+"</td><td>"+result[i].createdtime+"</td><td>"+result[i].endtime+"</td><td>"+result[i].executiontime+" min</td> <td>"+result[i].passcount+"</td><td>"+result[i].failcount+"</td><td>"+result[i].skipcount+"</td><td>"+result[i].totaltests+"</td></tr></tbody>");
                       }

               }});
          }

      }
