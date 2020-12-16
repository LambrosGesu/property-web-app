(function () {
    const $modalElement = $('#remove_owner');

    $modalElement.on('show.bs.modal', function (event) {
        let modalButton = $(event.relatedTarget);
        let id = modalButton.closest('[data-id]').data('id');

        let modalTitle = $('.modal-title');
        modalTitle.text(`Confirm delete Owner ${id}`);

        let deleteForm = $('#deleteForm_owner');

        deleteForm.attr('action', 'owner/'+id+'/delete');
    });
})();