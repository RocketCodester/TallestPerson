
import org.lgna.story.event.SceneActivationEvent;
import org.lgna.story.resources.sims2.FemaleChildHairRosettes;
import org.lgna.story.resources.sims2.FemaleChildTopAndBottomOutfit;
import org.lgna.story.resources.sims2.FemaleChildHairFormal;
import org.lgna.story.event.SceneActivationListener;
import org.lgna.story.resources.sims2.ChildFullBodyOutfitPuffyPJ;
import org.lgna.story.resources.sims2.Gender;
import org.lgna.story.resources.sims2.FemaleChildTopPieceCamisole;
import org.lgna.story.resources.sims2.FemaleChildHairBraids;
import org.lgna.story.resources.sims2.ChildBottomPieceBaggyPants;
import org.lgna.story.resources.sims2.BaseEyeColor;
import org.lgna.story.resources.sims2.ChildPersonResource;
import org.lgna.story.resources.sims2.BaseFace;
import org.lgna.story.resources.sims2.FemaleChildFullBodyOutfitDressShortBell;
import org.lgna.story.*;

public class Scene extends SScene {

    public Scene() {
        super();
    }

    private void performCustomSetup() {
    }

    private void performGeneratedSetUp() {
        this.setAtmosphereColor(new Color(0.588, 0.886, 0.988));
        this.setFromAboveLightColor(Color.WHITE);
        this.setFromBelowLightColor(Color.BLACK);
        this.setFogDensity(0.0);
        this.setName("myScene");
        this.ground.setPaint(SGround.SurfaceAppearance.GRASS);
        this.ground.setOpacity(1.0);
        this.ground.setName("ground");
        this.ground.setVehicle(this);
        this.camera.setName("camera");
        this.camera.setVehicle(this);
        this.camera.setOrientationRelativeToVehicle(new Orientation(0.0, 0.995185, 0.0980144, 6.12323E-17));
        this.camera.setPositionRelativeToVehicle(new Position(9.61E-16, 1.56, -7.85));
        this.becca.setPaint(Color.WHITE);
        this.becca.setOpacity(1.0);
        this.becca.setName("becca");
        this.becca.setVehicle(this);
        this.becca.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.becca.setPositionRelativeToVehicle(new Position(0.38, 0.0, -4.07));
        this.becca.setSize(new Size(0.324, 1.34, 0.232));
        this.jess.setPaint(Color.WHITE);
        this.jess.setOpacity(1.0);
        this.jess.setName("jess");
        this.jess.setVehicle(this);
        this.jess.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.jess.setPositionRelativeToVehicle(new Position(-0.1, 0.0, -4.07));
        this.jess.setSize(new Size(0.31, 1.23, 0.209));
        this.anne.setPaint(Color.WHITE);
        this.anne.setOpacity(1.0);
        this.anne.setName("anne");
        this.anne.setVehicle(this);
        this.anne.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.anne.setPositionRelativeToVehicle(new Position(-0.52, 0.0, -4.07));
        this.anne.setSize(new Size(0.272, 1.14, 0.223));
    }

    private void initializeEventListeners() {
        this.addSceneActivationListener(new SceneActivationListener() {
            @Override
            public void sceneActivated(final SceneActivationEvent e) {
                Scene.this.myFirstMethod();
            }
        });
    }

    @Override
    protected void handleActiveChanged(final Boolean isActive, final Integer activationCount) {
        if (isActive) {
            if (activationCount == 1) {
                this.performGeneratedSetUp();
                this.performCustomSetup();
                this.initializeEventListeners();
            } else {
                this.restoreStateAndEventListeners();
            }
        } else {
            this.preserveStateAndEventListeners();
        }
    }

    public void myFirstMethod() {
        becca.setHeight(1.2);
        jess.setHeight(1.35);
        anne.setHeight(1.5);
        double beccaHeight = becca.getHeight();
        double jessHeight = jess.getHeight();
        double anneHeight = anne.getHeight();
        if(beccaHeight>jessHeight && beccaHeight>anneHeight){
            becca.say("I am the tallest");
        } else if (jessHeight > anneHeight){
            jess.say("I am the tallest");
        } else {
            anne.say("I am the tallest");
        }
    }

    public SGround getGround() {
        return this.ground;
    }

    public SCamera getCamera() {
        return this.camera;
    }

    public ChildPerson getBecca() {
        return this.becca;
    }

    public ChildPerson getJess() {
        return this.jess;
    }

    public ChildPerson getAnne() {
        return this.anne;
    }
    private final SGround ground = new SGround();
    private final SCamera camera = new SCamera();
    private final ChildPerson becca = new ChildPerson(new ChildPersonResource(Gender.FEMALE, new Color(0.792, 0.565, 0.427), BaseEyeColor.DARK_BLUE, FemaleChildHairBraids.BROWN, 0.0, new FemaleChildTopAndBottomOutfit(FemaleChildTopPieceCamisole.WHITE, ChildBottomPieceBaggyPants.FLOWERS_BLUE), BaseFace.HUMAN_20));
    private final ChildPerson jess = new ChildPerson(new ChildPersonResource(Gender.FEMALE, new Color(0.278, 0.149, 0.0353), BaseEyeColor.DARK_BROWN, FemaleChildHairRosettes.BLACK, 1.0, ChildFullBodyOutfitPuffyPJ.GREEN_TEDDYBEAR, BaseFace.HUMAN_03));
    private final ChildPerson anne = new ChildPerson(new ChildPersonResource(Gender.FEMALE, new Color(0.89, 0.639, 0.498), BaseEyeColor.GREEN, FemaleChildHairFormal.BLOND, 0.0, FemaleChildFullBodyOutfitDressShortBell.BAND_W_STRIPE_GOTH, BaseFace.HUMAN_01));
}