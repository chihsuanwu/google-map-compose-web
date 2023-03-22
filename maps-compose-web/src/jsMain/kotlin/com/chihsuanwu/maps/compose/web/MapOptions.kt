package com.chihsuanwu.maps.compose.web

/**
 * Data class for configuring [GoogleMap] options
 *
 * See [MapOptions](https://developers.google.com/maps/documentation/javascript/reference/map#MapOptions)
 * for more details
 *
 * Note that some attributes that are duplicated in other controllers are not included here
 */
data class MapOptions(
    val backgroundColor: String? = null,
    val clickableIcons: Boolean? = null,
    val controlSize: Int? = null,
    val disableDefaultUI: Boolean? = null,
    val disableDoubleClickZoom: Boolean? = null,
    val draggableCursor: String? = null,
    val draggingCursor: String? = null,
    val fullscreenControl: Boolean? = null,
    val fullscreenControlOptions: dynamic = null,
    val gestureHandling: String? = null,
    val isFractionalZoomEnabled: Boolean? = null,
    val keyboardShortcuts: Boolean? = null,
    val mapId: String? = null,
    val mapTypeControl: Boolean? = null,
    val mapTypeControlOptions: dynamic = null,
    val mapTypeId: String? = null,
    val maxZoom: Double? = null,
    val minZoom: Double? = null,
    val noClear: Boolean? = null,
    val panControl: Boolean? = null,
    val panControlOptions: dynamic = null,
    val restriction: dynamic = null,
    val rotateControl: Boolean? = null,
    val rotateControlOptions: dynamic = null,
    val scaleControl: Boolean? = null,
    val scaleControlOptions: dynamic = null,
    val scrollwheel: Boolean? = null,
    val streetView: dynamic = null,
    val streetViewControl: Boolean? = null,
    val streetViewControlOptions: dynamic = null,
    val styles: Array<dynamic>? = null,
    val zoomControl: Boolean? = null,
    val zoomControlOptions: dynamic = null,
)