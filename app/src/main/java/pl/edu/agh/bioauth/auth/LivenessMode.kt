package pl.edu.agh.bioauth.auth

enum class LivenessMode {
    MOBILE, SERVER, MACHINE_LEARNING;

    companion object {
        private val baseValues = listOf(MOBILE, SERVER)
        internal fun getMode(modeClass: Int): LivenessMode = baseValues.getOrNull(modeClass) ?: SERVER
    }
}