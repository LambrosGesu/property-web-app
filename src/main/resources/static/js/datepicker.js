(function () {
    const dateField = $('#datepicker');
    dateField.datepicker({
        format: 'yyyy-mm-dd'
    });
})();

(function () {
    const dateField = $('#datepicker1');
    dateField.datepicker({
        format: 'yyyy-mm-dd'
    });

})();

(function () {
    const dateField = $('#datepicker2');
    dateField.datepicker({
        format: 'yyyy-mm-dd'
    });

})();

(function () {
    $('#datepicker').on("change", function(e) {
        let value = document.getElementById("datepicker").value;
        if(value){
            document.getElementById("datepicker1").disabled = true;
            document.getElementById("datepicker2").disabled = true;
        }else{
            document.getElementById("datepicker1").disabled = false;
            document.getElementById("datepicker2").disabled = false;
        }
    });

})();


(function () {
    $('#datepicker1').on("change", function(e) {
        let value = document.getElementById("datepicker1").value;
        if(value){
            document.getElementById("datepicker").disabled = true;
        }else{
            document.getElementById("datepicker").disabled = false;
        }
    });

})();

(function () {
    $('#datepicker2').on("change", function(e) {
        let value = document.getElementById("datepicker2").value;
        if(value){
            document.getElementById("datepicker").disabled = true;
        }else{
            document.getElementById("datepicker").disabled = false;
        }
    });

})();


