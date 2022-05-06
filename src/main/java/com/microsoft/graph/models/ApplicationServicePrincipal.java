package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ApplicationServicePrincipal implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** The application property  */
    private Application _application;
    /** The servicePrincipal property  */
    private ServicePrincipal _servicePrincipal;
    /**
     * Instantiates a new applicationServicePrincipal and sets the default values.
     * @return a void
     */
    public ApplicationServicePrincipal() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a applicationServicePrincipal
     */
    @javax.annotation.Nonnull
    public static ApplicationServicePrincipal createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ApplicationServicePrincipal();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the application property value. The application property
     * @return a application
     */
    @javax.annotation.Nullable
    public Application getApplication() {
        return this._application;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ApplicationServicePrincipal currentObject = this;
        return new HashMap<>(2) {{
            this.put("application", (n) -> { currentObject.setApplication(n.getObjectValue(Application::createFromDiscriminatorValue)); });
            this.put("servicePrincipal", (n) -> { currentObject.setServicePrincipal(n.getObjectValue(ServicePrincipal::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the servicePrincipal property value. The servicePrincipal property
     * @return a servicePrincipal
     */
    @javax.annotation.Nullable
    public ServicePrincipal getServicePrincipal() {
        return this._servicePrincipal;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("application", this.getApplication());
        writer.writeObjectValue("servicePrincipal", this.getServicePrincipal());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the application property value. The application property
     * @param value Value to set for the application property.
     * @return a void
     */
    public void setApplication(@javax.annotation.Nullable final Application value) {
        this._application = value;
    }
    /**
     * Sets the servicePrincipal property value. The servicePrincipal property
     * @param value Value to set for the servicePrincipal property.
     * @return a void
     */
    public void setServicePrincipal(@javax.annotation.Nullable final ServicePrincipal value) {
        this._servicePrincipal = value;
    }
}
