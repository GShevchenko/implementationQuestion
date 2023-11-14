public interface MyDocumentService {


    /**
     * This method in the current implementation has a complex logic of searching documents by their 'status';
     * The field 'status' should be removed and implementation of this method should be fully changed.
     * @param request - contain
     * @return
     */
    SomeResponse getAll(StatusHolder request);


    SomeResponse list(SomeRequest request);
    SomeResponse findByDocumentId(SomeRequest request);
    SomeResponse get(SomeRequest request);


    SomeResponse create(SomeRequest request);
    SomeResponse delete(SomeRequest request);
    SomeResponse changeStatus(SomeRequest request);
    SomeResponse removePowers(SomeRequest request);


}
