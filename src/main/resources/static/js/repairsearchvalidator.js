
(function () {
    $('#repsearchform').validate({
        rules: {
            repairDate: {
                date : true,
                required: false
            },
            BetweenDate1: {
                date : true,
                required: false
            },
            BetweenDate2: {
                date : true,
                required: false
            },
            SSN: {
                required: false,
                digits: true,
                minlength: 9,
                maxlength: 9
            }
        },
        messages: {
            SSN: {
                minlength: "It should be 9 digits.",
                maxlength: "It should be 9 digits."
            }
        }
    });
})();

