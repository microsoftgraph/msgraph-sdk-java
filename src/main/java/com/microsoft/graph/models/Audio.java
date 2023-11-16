package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Audio implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    public BackingStore backingStore;
    /**
     * Instantiates a new Audio and sets the default values.
     */
    public Audio() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Audio
     */
    @jakarta.annotation.Nonnull
    public static Audio createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Audio();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the album property value. The title of the album for this audio file.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAlbum() {
        return this.backingStore.get("album");
    }
    /**
     * Gets the albumArtist property value. The artist named on the album for the audio file.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAlbumArtist() {
        return this.backingStore.get("albumArtist");
    }
    /**
     * Gets the artist property value. The performing artist for the audio file.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getArtist() {
        return this.backingStore.get("artist");
    }
    /**
     * Gets the bitrate property value. Bitrate expressed in kbps.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getBitrate() {
        return this.backingStore.get("bitrate");
    }
    /**
     * Gets the composers property value. The name of the composer of the audio file.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getComposers() {
        return this.backingStore.get("composers");
    }
    /**
     * Gets the copyright property value. Copyright information for the audio file.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCopyright() {
        return this.backingStore.get("copyright");
    }
    /**
     * Gets the disc property value. The number of the disc this audio file came from.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getDisc() {
        return this.backingStore.get("disc");
    }
    /**
     * Gets the discCount property value. The total number of discs in this album.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getDiscCount() {
        return this.backingStore.get("discCount");
    }
    /**
     * Gets the duration property value. Duration of the audio file, expressed in milliseconds
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getDuration() {
        return this.backingStore.get("duration");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(17);
        deserializerMap.put("album", (n) -> { this.setAlbum(n.getStringValue()); });
        deserializerMap.put("albumArtist", (n) -> { this.setAlbumArtist(n.getStringValue()); });
        deserializerMap.put("artist", (n) -> { this.setArtist(n.getStringValue()); });
        deserializerMap.put("bitrate", (n) -> { this.setBitrate(n.getLongValue()); });
        deserializerMap.put("composers", (n) -> { this.setComposers(n.getStringValue()); });
        deserializerMap.put("copyright", (n) -> { this.setCopyright(n.getStringValue()); });
        deserializerMap.put("disc", (n) -> { this.setDisc(n.getIntegerValue()); });
        deserializerMap.put("discCount", (n) -> { this.setDiscCount(n.getIntegerValue()); });
        deserializerMap.put("duration", (n) -> { this.setDuration(n.getLongValue()); });
        deserializerMap.put("genre", (n) -> { this.setGenre(n.getStringValue()); });
        deserializerMap.put("hasDrm", (n) -> { this.setHasDrm(n.getBooleanValue()); });
        deserializerMap.put("isVariableBitrate", (n) -> { this.setIsVariableBitrate(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("title", (n) -> { this.setTitle(n.getStringValue()); });
        deserializerMap.put("track", (n) -> { this.setTrack(n.getIntegerValue()); });
        deserializerMap.put("trackCount", (n) -> { this.setTrackCount(n.getIntegerValue()); });
        deserializerMap.put("year", (n) -> { this.setYear(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the genre property value. The genre of this audio file.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getGenre() {
        return this.backingStore.get("genre");
    }
    /**
     * Gets the hasDrm property value. Indicates if the file is protected with digital rights management.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getHasDrm() {
        return this.backingStore.get("hasDrm");
    }
    /**
     * Gets the isVariableBitrate property value. Indicates if the file is encoded with a variable bitrate.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsVariableBitrate() {
        return this.backingStore.get("isVariableBitrate");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the title property value. The title of the audio file.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTitle() {
        return this.backingStore.get("title");
    }
    /**
     * Gets the track property value. The number of the track on the original disc for this audio file.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getTrack() {
        return this.backingStore.get("track");
    }
    /**
     * Gets the trackCount property value. The total number of tracks on the original disc for this audio file.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getTrackCount() {
        return this.backingStore.get("trackCount");
    }
    /**
     * Gets the year property value. The year the audio file was recorded.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getYear() {
        return this.backingStore.get("year");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("album", this.getAlbum());
        writer.writeStringValue("albumArtist", this.getAlbumArtist());
        writer.writeStringValue("artist", this.getArtist());
        writer.writeLongValue("bitrate", this.getBitrate());
        writer.writeStringValue("composers", this.getComposers());
        writer.writeStringValue("copyright", this.getCopyright());
        writer.writeIntegerValue("disc", this.getDisc());
        writer.writeIntegerValue("discCount", this.getDiscCount());
        writer.writeLongValue("duration", this.getDuration());
        writer.writeStringValue("genre", this.getGenre());
        writer.writeBooleanValue("hasDrm", this.getHasDrm());
        writer.writeBooleanValue("isVariableBitrate", this.getIsVariableBitrate());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("title", this.getTitle());
        writer.writeIntegerValue("track", this.getTrack());
        writer.writeIntegerValue("trackCount", this.getTrackCount());
        writer.writeIntegerValue("year", this.getYear());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the album property value. The title of the album for this audio file.
     * @param value Value to set for the album property.
     */
    public void setAlbum(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("album", value);
    }
    /**
     * Sets the albumArtist property value. The artist named on the album for the audio file.
     * @param value Value to set for the albumArtist property.
     */
    public void setAlbumArtist(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("albumArtist", value);
    }
    /**
     * Sets the artist property value. The performing artist for the audio file.
     * @param value Value to set for the artist property.
     */
    public void setArtist(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("artist", value);
    }
    /**
     * Sets the bitrate property value. Bitrate expressed in kbps.
     * @param value Value to set for the bitrate property.
     */
    public void setBitrate(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("bitrate", value);
    }
    /**
     * Sets the composers property value. The name of the composer of the audio file.
     * @param value Value to set for the composers property.
     */
    public void setComposers(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("composers", value);
    }
    /**
     * Sets the copyright property value. Copyright information for the audio file.
     * @param value Value to set for the copyright property.
     */
    public void setCopyright(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("copyright", value);
    }
    /**
     * Sets the disc property value. The number of the disc this audio file came from.
     * @param value Value to set for the disc property.
     */
    public void setDisc(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("disc", value);
    }
    /**
     * Sets the discCount property value. The total number of discs in this album.
     * @param value Value to set for the discCount property.
     */
    public void setDiscCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("discCount", value);
    }
    /**
     * Sets the duration property value. Duration of the audio file, expressed in milliseconds
     * @param value Value to set for the duration property.
     */
    public void setDuration(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("duration", value);
    }
    /**
     * Sets the genre property value. The genre of this audio file.
     * @param value Value to set for the genre property.
     */
    public void setGenre(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("genre", value);
    }
    /**
     * Sets the hasDrm property value. Indicates if the file is protected with digital rights management.
     * @param value Value to set for the hasDrm property.
     */
    public void setHasDrm(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("hasDrm", value);
    }
    /**
     * Sets the isVariableBitrate property value. Indicates if the file is encoded with a variable bitrate.
     * @param value Value to set for the isVariableBitrate property.
     */
    public void setIsVariableBitrate(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isVariableBitrate", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the title property value. The title of the audio file.
     * @param value Value to set for the title property.
     */
    public void setTitle(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("title", value);
    }
    /**
     * Sets the track property value. The number of the track on the original disc for this audio file.
     * @param value Value to set for the track property.
     */
    public void setTrack(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("track", value);
    }
    /**
     * Sets the trackCount property value. The total number of tracks on the original disc for this audio file.
     * @param value Value to set for the trackCount property.
     */
    public void setTrackCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("trackCount", value);
    }
    /**
     * Sets the year property value. The year the audio file was recorded.
     * @param value Value to set for the year property.
     */
    public void setYear(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("year", value);
    }
}
