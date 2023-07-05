package com.sweetwaveforms.releaseplanner.repository;

import com.sweetwaveforms.releaseplanner.model.SongRequest;
import com.sweetwaveforms.releaseplanner.model.WorkManager;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRequestRepository extends JpaRepository<WorkManager, Long> {
}
