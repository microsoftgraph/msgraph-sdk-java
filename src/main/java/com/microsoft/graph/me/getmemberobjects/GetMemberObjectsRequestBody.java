package microsoft.graph.me.getmemberobjects;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the getMemberObjects method. */
public class GetMemberObjectsRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The securityEnabledOnly property */
    private Boolean _securityEnabledOnly;
    /**
     * Instantiates a new getMemberObjectsRequestBody and sets the default values.
     * @return a void
     */
    public GetMemberObjectsRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a getMemberObjectsRequestBody
     */
    @javax.annotation.Nonnull
    public static GetMemberObjectsRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GetMemberObjectsRequestBody();
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
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final GetMemberObjectsRequestBody currentObject = this;
        return new HashMap<>(1) {{
            this.put("securityEnabledOnly", (n) -> { currentObject.setSecurityEnabledOnly(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the securityEnabledOnly property value. The securityEnabledOnly property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSecurityEnabledOnly() {
        return this._securityEnabledOnly;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("securityEnabledOnly", this.getSecurityEnabledOnly());
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
     * Sets the securityEnabledOnly property value. The securityEnabledOnly property
     * @param value Value to set for the securityEnabledOnly property.
     * @return a void
     */
    public void setSecurityEnabledOnly(@javax.annotation.Nullable final Boolean value) {
        this._securityEnabledOnly = value;
    }
}
