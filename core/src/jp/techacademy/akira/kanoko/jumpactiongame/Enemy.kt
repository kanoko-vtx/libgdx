package jp.techacademy.akira.kanoko.jumpactiongame

import com.badlogic.gdx.graphics.Texture

class Enemy (texture: Texture, srcX: Int, srcY: Int, srcWidth: Int, srcHeight: Int)
    : GameObject(texture, srcX, srcY, srcWidth, srcHeight) {

    companion object {
        // 横幅、高さ
        val ENEMY_WIDTH = 2.0f
        val ENEMY_HEIGHT = 1.3f

        // 状態
        val ENEMY_EXIST = 0
        val ENEMY_NONE = 1
    }

    var mState: Int = 0

    init {
        setSize(ENEMY_WIDTH, ENEMY_HEIGHT)
        mState = ENEMY_EXIST
    }

    fun get() {
        mState = ENEMY_NONE
        setAlpha(0f)
    }
}