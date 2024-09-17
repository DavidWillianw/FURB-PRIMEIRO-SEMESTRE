from pytube import YouTube
import moviepy.editor as mp

def download_best_quality(url):
    try:
        yt = YouTube(url)
        
        # Filtrar streams de vídeo com resolução de 1080p até 4K
        video_streams = yt.streams.filter(res="1080p").order_by('resolution').desc().all()
        video_streams += yt.streams.filter(res="1440p").order_by('resolution').desc().all()
        video_streams += yt.streams.filter(res="2160p").order_by('resolution').desc().all()
        
        # Filtrar streams de áudio
        audio_stream = yt.streams.filter(only_audio=True).order_by('abr').desc().first()
        
        if video_streams and audio_stream:
            # Selecionar o stream de vídeo com a maior resolução
            video_stream = video_streams[0]
            
            # Baixar o vídeo e o áudio separadamente
            video_filename = "video.mp4"
            audio_filename = "audio.mp3"
            video_stream.download(output_path=".", filename=video_filename)
            audio_stream.download(output_path=".", filename=audio_filename)
            
            # Combinar vídeo e áudio
            video_clip = mp.VideoFileClip(video_filename)
            audio_clip = mp.AudioFileClip(audio_filename)
            final_clip = video_clip.set_audio(audio_clip)
            final_clip.write_videofile("final_video.mp4", codec="libx264")
            
            print("Download completo! O vídeo foi salvo como: final_video.mp4")
        else:
            print("Não foi possível encontrar uma combinação de vídeo e áudio entre 1080p e 4K.")
    
    except Exception as e:
        print(f"Ocorreu um erro: {e}")

# Exemplo de uso
if __name__ == "__main__":
    try:
        url = input("Digite a URL do vídeo do YouTube que deseja baixar: ")
        download_best_quality(url)
    except KeyboardInterrupt:
        print("\nDownload cancelado pelo usuário.")
