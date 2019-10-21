package io.github.przbetkier.tuscan.common

import io.github.przbetkier.tuscan.domain.profiles.LatestProfile

import java.time.LocalDateTime

import static integration.common.MockedPlayer.NICKNAME

class SampleLatestProfile {

    def static simple(String nickname = NICKNAME, date = LocalDateTime.now()) {
        return new LatestProfile(
                nickname,
                "https://avatar.url",
                5,
                1000,
                1.21,
                date
        )
    }
}
