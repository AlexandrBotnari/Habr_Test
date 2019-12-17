package pageObjects;

public class SpecialsPage extends AbstractPage{
    public SpecialsPage() {super();
    }

    @Override
    public String getUrl() {
        url = "/catalog/26";
        return url;
    }
}
