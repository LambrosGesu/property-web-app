(function () {
    const $modalElement = $('#remove');

    $modalElement.on('show.bs.modal', function (event) {
        let modalButton = $(event.relatedTarget);
        let id = modalButton.closest('[data-id]').data('id');
        console.log(id);

        let modalTitle = $('.modal-title');
        modalTitle.text(`Confirm delete Repair ${id}`);

        let deleteForm = $('#deleteForm');

        deleteForm.attr('action', 'repair/'+id+'/delete');
    });
})();