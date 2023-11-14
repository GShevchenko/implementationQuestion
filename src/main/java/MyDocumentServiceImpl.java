import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MyDocumentServiceImpl implements MyDocumentService {


    /**
     * This method contains very complex logic with field 'status',
     * which should be replaced with fields 'validFrom' and 'validTo'.
     * Because of complexity, I can't change this method by replacing 'status' with fields 'validFrom' and 'validTo'
     * 1) Should I remove implementation of the getAll() method and make it abstract in the current service
     * and realize this method in a child class?
     * 2) Should I fully replace current implementation of the getAll() method in the current service MyDocumentServiceImpl?
     * 3) Should I extract get-methods in a separate interface and create its realization?
     *
     */
    @Override
    public SomeResponse getAll(Request request) {
        List<MyDocument> documentList = documentRepitory.findAll();
        List<MyDocument> result = new ArrayList<>();
        for (MyDocument document : documentList) {
            if (Objects.equals(document.getStatus(), request.getStatus()) && ...) {
                performSomeCode_0(result, document);
            }
            
            if (Objects.equals(document.getStatus(), request.getStatus()) && ...) {
                performSomeCode_1(result, document);
            }
            if (Objects.equals(document.getStatus(), request.getStatus()) && ...) {
                performSomeCode_3(result, document);
            }
        }
        return SomewResponse.of(result);
    }
    

    @Override
    public SomeResponse list(SomeRequest request) {
        //some implementation
        return someResponse;
    }

    @Override
    public SomeResponse get(SomeRequest request) {
        //some implementation
        return someResponse;
    }

    @Override
    public SomeResponse create(SomeRequest request) {
        //some implementation
        return someResponse;
    }

    @Override
    public SomeResponse delete(SomeRequest request) {
        //some implementation
        return someResponse;
    }

    @Override
    public SomeResponse changeStatus(SomeRequest request) {
        //some implementation
        return someResponse;
    }

    @Override
    public SomeResponse removePowers(SomeRequest request) {
        //some implementation
        return someResponse;
    }

    @Override
    public SomeResponse findByDocumentId(SomeRequest request) {
        //some implementation
        return someResponse;
    }
}
