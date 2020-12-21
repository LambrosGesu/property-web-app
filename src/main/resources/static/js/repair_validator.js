(function () {
$.validator.addMethod('decimal', function(value, element) {
  return this.optional(element) || /^((\d+(\\,\d{0,2})?)|((\d*(\,\d{1,2}))))$/.test(value);
}, "Please enter a correct number, format 0,00");
    $('#add-repair').validate({
        rules: {
            repairDate: {
                required: true
            },
            price: {
                required: true,
                decimal:true
                },
            address: {
                required: true
            },
            description: {
                required: false
            },
            owner: {
                required: true,
                digits: true,
                minlength: 9,
                maxlength: 9
            }
        },
        messages: {
            repairDate: {
                required: "Please insert a date"
            },
            price: {
                required: "Please insert the price",
                number: "Only digits please"
            },
            address: {
                required: "Please insert an address"
            },
            owner: {
                required: "Please insert the Owner SSN",
                digits: "Only digits please",
                minlength: "The length must exact 9 digits",
                maxlength: "The length must exact 9 digits"
            }
        }
    });
})();