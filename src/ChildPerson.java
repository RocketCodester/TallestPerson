
import org.lgna.story.resources.sims2.ChildPersonResource;

public class ChildPerson extends Person {

    public ChildPerson(final ChildPersonResource resource) {
        super(resource);
    }

    public void setChildPersonResource(final ChildPersonResource childPersonResource) {
        this.setJointedModelResource(childPersonResource);
    }
}
