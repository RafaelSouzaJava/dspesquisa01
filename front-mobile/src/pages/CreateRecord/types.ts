export type GamePlatform = 'XBOX' | 'PC' | 'PLAYSTATION' | 'MOBILE';

export type Game = {
    id: number;
    title: string;
    platform: GamePlatform;
    label: string;
    value: number;
    
}