const parentSelectorForError = function (element) {
    return $(element).closest(".validation-message");
};

export default {
    errorElement: 'div',
    highlight: function (element, errorClass, validClass) {
        $(element).addClass(errorClass).removeClass(validClass);
        // parentSelectorForError(element).addClass(errorClass);
    },
    unhighlight: function (element, errorClass, validClass) {
        $(element).removeClass(errorClass).addClass(validClass);
        // parentSelectorForError(element).removeClass(errorClass).removeClass(errorClass);
    },
    errorPlacement: function (error, element) {
        error.addClass('label');
        parentSelectorForError(element).append(error);
    }
}