
jQuery(function () {
    $('#repsearchform').validate({

        rules: {
            repairDate: {
                required: false
            },
            BetweenDate1: {
                required: false
            },
            BetweenDate2: {
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
        },

        errorElement : 'div',
        errorLabelContainer: '.errorTxt'
    });
})();

