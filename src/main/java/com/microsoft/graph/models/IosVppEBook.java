package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class IosVppEBook extends ManagedEBook implements Parsable {
    /** The Apple ID associated with Vpp token. */
    private String _appleId;
    /** Genres. */
    private java.util.List<String> _genres;
    /** Language. */
    private String _language;
    /** Seller. */
    private String _seller;
    /** Total license count. */
    private Integer _totalLicenseCount;
    /** Used license count. */
    private Integer _usedLicenseCount;
    /** The Vpp token's organization name. */
    private String _vppOrganizationName;
    /** The Vpp token ID. */
    private String _vppTokenId;
    /**
     * Instantiates a new IosVppEBook and sets the default values.
     * @return a void
     */
    public IosVppEBook() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a IosVppEBook
     */
    @javax.annotation.Nonnull
    public static IosVppEBook createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IosVppEBook();
    }
    /**
     * Gets the appleId property value. The Apple ID associated with Vpp token.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppleId() {
        return this._appleId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final IosVppEBook currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("appleId", (n) -> { currentObject.setAppleId(n.getStringValue()); });
            this.put("genres", (n) -> { currentObject.setGenres(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("language", (n) -> { currentObject.setLanguage(n.getStringValue()); });
            this.put("seller", (n) -> { currentObject.setSeller(n.getStringValue()); });
            this.put("totalLicenseCount", (n) -> { currentObject.setTotalLicenseCount(n.getIntegerValue()); });
            this.put("usedLicenseCount", (n) -> { currentObject.setUsedLicenseCount(n.getIntegerValue()); });
            this.put("vppOrganizationName", (n) -> { currentObject.setVppOrganizationName(n.getStringValue()); });
            this.put("vppTokenId", (n) -> { currentObject.setVppTokenId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the genres property value. Genres.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getGenres() {
        return this._genres;
    }
    /**
     * Gets the language property value. Language.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLanguage() {
        return this._language;
    }
    /**
     * Gets the seller property value. Seller.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSeller() {
        return this._seller;
    }
    /**
     * Gets the totalLicenseCount property value. Total license count.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTotalLicenseCount() {
        return this._totalLicenseCount;
    }
    /**
     * Gets the usedLicenseCount property value. Used license count.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getUsedLicenseCount() {
        return this._usedLicenseCount;
    }
    /**
     * Gets the vppOrganizationName property value. The Vpp token's organization name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVppOrganizationName() {
        return this._vppOrganizationName;
    }
    /**
     * Gets the vppTokenId property value. The Vpp token ID.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVppTokenId() {
        return this._vppTokenId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("appleId", this.getAppleId());
        writer.writeCollectionOfPrimitiveValues("genres", this.getGenres());
        writer.writeStringValue("language", this.getLanguage());
        writer.writeStringValue("seller", this.getSeller());
        writer.writeIntegerValue("totalLicenseCount", this.getTotalLicenseCount());
        writer.writeIntegerValue("usedLicenseCount", this.getUsedLicenseCount());
        writer.writeStringValue("vppOrganizationName", this.getVppOrganizationName());
        writer.writeStringValue("vppTokenId", this.getVppTokenId());
    }
    /**
     * Sets the appleId property value. The Apple ID associated with Vpp token.
     * @param value Value to set for the appleId property.
     * @return a void
     */
    public void setAppleId(@javax.annotation.Nullable final String value) {
        this._appleId = value;
    }
    /**
     * Sets the genres property value. Genres.
     * @param value Value to set for the genres property.
     * @return a void
     */
    public void setGenres(@javax.annotation.Nullable final java.util.List<String> value) {
        this._genres = value;
    }
    /**
     * Sets the language property value. Language.
     * @param value Value to set for the language property.
     * @return a void
     */
    public void setLanguage(@javax.annotation.Nullable final String value) {
        this._language = value;
    }
    /**
     * Sets the seller property value. Seller.
     * @param value Value to set for the seller property.
     * @return a void
     */
    public void setSeller(@javax.annotation.Nullable final String value) {
        this._seller = value;
    }
    /**
     * Sets the totalLicenseCount property value. Total license count.
     * @param value Value to set for the totalLicenseCount property.
     * @return a void
     */
    public void setTotalLicenseCount(@javax.annotation.Nullable final Integer value) {
        this._totalLicenseCount = value;
    }
    /**
     * Sets the usedLicenseCount property value. Used license count.
     * @param value Value to set for the usedLicenseCount property.
     * @return a void
     */
    public void setUsedLicenseCount(@javax.annotation.Nullable final Integer value) {
        this._usedLicenseCount = value;
    }
    /**
     * Sets the vppOrganizationName property value. The Vpp token's organization name.
     * @param value Value to set for the vppOrganizationName property.
     * @return a void
     */
    public void setVppOrganizationName(@javax.annotation.Nullable final String value) {
        this._vppOrganizationName = value;
    }
    /**
     * Sets the vppTokenId property value. The Vpp token ID.
     * @param value Value to set for the vppTokenId property.
     * @return a void
     */
    public void setVppTokenId(@javax.annotation.Nullable final String value) {
        this._vppTokenId = value;
    }
}
