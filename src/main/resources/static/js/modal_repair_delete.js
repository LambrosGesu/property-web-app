(function () {
    const $modalElement = $('#remove');

    $modalElement.on('show.bs.modal', function (event) {
        let modalButton = $(event.relatedTarget);
        let id = modalButton.closest('[data-id]').data('id');

        let modalTitle = $('.modal-title');
        modalTitle.text(`Confirm  Repair Delete`);

        let deleteForm = $('#deleteForm');

        deleteForm.attr('action', '/admin/repair/'+id+'/delete');
    });
})();