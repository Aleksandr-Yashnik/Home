public interface Updatable {
     /** Обновляет прошивку устройства до указанной версии.
            * @param version Версия новой прошивки.
            */
    void updateFirmware(String version);

}
