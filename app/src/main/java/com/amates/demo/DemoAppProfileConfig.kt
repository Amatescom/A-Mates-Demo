package com.amates.demo

import com.amates.support.ProfileConfig

/**
 * Your implementation that allows users to link their Amates profile with your profile for seamless synchronization across multiple devices.
 */
class DemoAppProfileConfig : ProfileConfig {

    private var receivedUserId: Int? = null

    /**
     * Provide userId, if the user already has one to prevent Amates from registering a new user.
     */
    override val userId: Int?
        get() = receivedUserId

    /**
     * Provide userName, so that Amates can register a new user with that specific name
     */
    override val userName: String
        get() = "My unique nickname"

    override fun onUserIdReceived(id: Int) {
        // Store id in your profile for restoration of Amates profile on other devices by the same user.
        receivedUserId = id
    }
}