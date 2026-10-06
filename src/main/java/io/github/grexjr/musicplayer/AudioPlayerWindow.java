package io.github.grexjr.musicplayer;

import uk.co.caprica.vlcj.player.component.AudioPlayerComponent;

import javax.swing.*;
import java.awt.*;

public class AudioPlayerWindow {

    private static final String WINDOW_TITLE = "Audio Player";
    private static final String LAST_SONG = "Last Song";
    private static final String REWIND = "Rewind";
    private static final String PLAY = "Play/Pause";
    private static final String SKIP = "Skip Ahead";
    private static final String NEXT_SONG = "Next Song";

    private final JFrame frame = new JFrame(WINDOW_TITLE);
    private final JPanel contentPane = new JPanel();
    private final JPanel controlPanel = new JPanel();
    private final JPanel imagePanel = new JPanel();
    private final JButton lastSongButton = new JButton(LAST_SONG);
    private final JButton rewindButton = new JButton(REWIND);
    private final JButton playButton = new JButton(PLAY);
    private final JButton skipButton = new JButton(SKIP);
    private final JButton nextSongButton = new JButton(NEXT_SONG);

    public AudioPlayerWindow(AudioPlayerComponent audioPlayer){
        frame.setSize(600,400);
        // Exit on close
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // Set layout of the main panel of the application
        contentPane.setLayout(new BorderLayout());

        // Initialize the control panel
        controlPanel.add(lastSongButton);
        controlPanel.add(rewindButton);
        controlPanel.add(playButton);
        controlPanel.add(skipButton);
        controlPanel.add(nextSongButton);

        // Initialize the image panel | TODO: will add filepath of image from... somewhere, dependency injection
        // TEMP - make it black
        imagePanel.setBackground(Color.BLACK);

        // Add the image panel in CENTER
        contentPane.add(imagePanel,BorderLayout.CENTER);

        // Add the control panel at the bottom
        contentPane.add(controlPanel,BorderLayout.SOUTH);

        // Add the contentPane to the actual frame
        frame.setContentPane(contentPane);

        // Center to screen and activate the frame
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }




}
